package cg.data.newReader;

import java.io.File;
import java.util.Collection;
import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.google.common.collect.Lists;
import com.google.common.collect.Maps;

import cg.base.animation.AnimationReader;
import cg.base.image.ImageManager;
import cg.base.image.ImageReader;
import cg.base.io.ResourceInfo;
import cg.base.sprite.Unit;
import cg.base.util.MathUtil;
import cg.data.resource.AnimationReaderCreator;
import cg.data.resource.AttributesLoadManager;
import cg.data.resource.ObjectReader;
import cg.data.resource.ProjectData;
import cg.data.sprite.RoleAnimationInfo;

public class CRoleAnimationInfoReader implements ObjectReader<RoleAnimationInfo> {
	
	private static final Logger log = LoggerFactory.getLogger(CRoleAnimationInfoReader.class);
	
	private ImageReader imageReader;
	
	private AnimationReader animationReader;
	
	private final ImageManager imageManager;
	
	private final AnimationReaderCreator animationReaderCreator;
	
	public CRoleAnimationInfoReader(ImageManager imageManager, AnimationReaderCreator animationReaderCreator) {
		this.imageManager = imageManager;
		this.animationReaderCreator = animationReaderCreator;
	}

	@Override
	public List<RoleAnimationInfo> read(ProjectData projectData) {
		imageReader = imageManager.getImageReader();
		animationReader = animationReaderCreator.getAnimationReader();
		try {
			int[] roleIds = AttributesLoadManager.loadAttributesData("role_animation", "role_id", "role_id");
			int[] animationGlobalIds = AttributesLoadManager.loadAttributesData("role_animation", "role_id", "animation_global_id");
			int[] headGlobalIds = AttributesLoadManager.loadAttributesData("role_animation", "role_id", "head_global_id");
			String[] sexs = AttributesLoadManager.loadAttributesStrData("role_animation", "role_id", "sex");
			String[] pages = AttributesLoadManager.loadAttributesStrData("role_animation", "role_id", "page");
			Map<Byte, CRoleAnimationInfo> indexs = Maps.newTreeMap();
			ResourceInfo[] headInfos = imageReader.getImageDictionaries(headGlobalIds);
			ResourceInfo[] animationInfos = animationReader.getResourceInfos(animationGlobalIds);
			for (int i = 0;i < roleIds.length;i++) {
				CRoleAnimationInfo animationInfo;
				byte roleId = (byte) roleIds[i];
				if (indexs.containsKey(roleId)) {
					animationInfo = indexs.get(roleId);
				} else {
					animationInfo = new CRoleAnimationInfo();
					animationInfo.roleId = roleId;
					indexs.put(roleId, animationInfo);
				}
				animationInfo.addAnimationInfo(animationInfos[i]);
				animationInfo.addHeadInfo(headInfos[i]);
				animationInfo.sex = sexs[i].equals("男") ? Unit.SEX_MALE : Unit.SEX_FEMALE;
				animationInfo.pageIndex = MathUtil.stringToByte(pages[i], RoleAnimationInfo.NO_SELECT_PAGE);
			}
			return Lists.newArrayList(indexs.values().toArray(new RoleAnimationInfo[indexs.size()]));
		} catch (Exception e) {
			log.error("", e);
			return null;
		}
	}
	
	private static class CRoleAnimationInfo implements RoleAnimationInfo {
		
		private byte roleId, sex, pageIndex;
		
		private ResourceInfo[] animationsInfo, headsInfo;

		@Override
		public byte getRoleId() {
			return roleId;
		}

		@Override
		public byte getSex() {
			return sex;
		}

		@Override
		public ResourceInfo[] getAnimationsInfo() {
			return animationsInfo;
		}

		@Override
		public ResourceInfo[] getHeadsInfo() {
			return headsInfo;
		}
		
		public void addAnimationInfo(ResourceInfo resourceInfo) {
			if (resourceInfo != null) {
				if (animationsInfo == null) {
					animationsInfo = new ResourceInfo[]{resourceInfo};
				} else {
					ResourceInfo[] ret = new ResourceInfo[animationsInfo.length + 1];
					System.arraycopy(animationsInfo, 0, ret, 0, animationsInfo.length);
					ret[animationsInfo.length] = resourceInfo;
					animationsInfo = ret;
				}
			}
		}
		
		public void addHeadInfo(ResourceInfo resourceInfo) {
			if (resourceInfo != null) {
				if (headsInfo == null) {
					headsInfo = new ResourceInfo[]{resourceInfo};
				} else {
					ResourceInfo[] ret = new ResourceInfo[headsInfo.length + 1];
					System.arraycopy(headsInfo, 0, ret, 0, headsInfo.length);
					ret[headsInfo.length] = resourceInfo;
					headsInfo = ret;
				}
			}
		}

		@Override
		public byte getSelectPageIndex() {
			return pageIndex;
		}
		
	}

	@Override
	public void output(File outFile, Collection<RoleAnimationInfo> collection) throws Exception {
		// TODO Auto-generated method stub
		
	}

}
