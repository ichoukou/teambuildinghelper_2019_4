package cn.jbolt.common.model;

import com.jfinal.plugin.activerecord.ActiveRecordPlugin;

/**
 * Generated by JFinal, do not modify this file.
 * 
 * <pre>
 * Example:
 * public void configPlugin(Plugins me) {
 *     ActiveRecordPlugin arp = new ActiveRecordPlugin(...);
 *     _MappingKit.mapping(arp);
 *     me.add(arp);
 * }
 * </pre>
 */
public class _MappingKit {

	public static void mapping(ActiveRecordPlugin arp) {
		arp.addMapping("activity", "id", Activity.class);
		arp.addMapping("agency", "id", Agency.class);
		arp.addMapping("goods", "id", Goods.class);
		arp.addMapping("invitation", "id", Invitation.class);
		arp.addMapping("order", "id", Order.class);
		arp.addMapping("user", "id", User.class);
		arp.addMapping("Scene", "id", Scene.class);
	}
}