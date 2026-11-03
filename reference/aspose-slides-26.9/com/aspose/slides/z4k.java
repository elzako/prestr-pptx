package com.aspose.slides;

final class z4k extends DomObject<Presentation> implements IMasterHandoutSlideManager {
   MasterHandoutSlide n5;

   @Override
   public final IMasterHandoutSlide getMasterHandoutSlide() {
      return this.n5;
   }

   @Override
   public final IMasterHandoutSlide setDefaultMasterHandoutSlide() {
      this.n5 = new MasterHandoutSlide(this);
      MasterTheme var1 = new MasterTheme(this.u9);
      b2y.n5(var1);
      this.n5.getThemeManager().setOverrideTheme(var1);
      this.n5.getThemeManager().setOverrideThemeEnabled(true);
      return this.n5;
   }

   @Override
   public final void removeMasterHandoutSlide() {
      this.n5 = null;
   }

   final MasterHandoutSlide n5() {
      this.n5 = new MasterHandoutSlide(this);
      return this.n5;
   }

   z4k(Presentation var1) {
      super(var1);
   }

   static AutoShape n5(MasterHandoutSlide var0, String var1) {
      AutoShape var2 = ((ShapeCollection)var0.k5.getShapes()).y4();
      var2.u6();
      o4f var3 = var2.R_();
      var3.n5(e4c.k5.u9());
      var2.n5(234.0, 36.12503937007874);
      var2.e2().l6(5);
      var2.setAlternativeText("");
      var2.setName(var1);
      var2.n5((byte)0, (byte)2, (byte)7, 0L, false);
      var2.getAutoShapeLock().setGroupingLocked(true);
      TextFrame var4 = var2.x8();
      TextFrameFormat var5 = (TextFrameFormat)var4.getTextFrameFormat();
      i6f.n5(var5);
      IParagraphFormat var6 = var5.h0().l6(0);
      var6.setAlignment(0);
      var6.getDefaultPortionFormat().setFontHeight(12.0F);
      return var2;
   }

   static AutoShape l6(MasterHandoutSlide var0, String var1) {
      AutoShape var2 = ((ShapeCollection)var0.k5.getShapes()).y4();
      var2.u6();
      o4f var3 = var2.R_();
      var3.n5(new e4c(0.0, 683.8750393700788));
      var2.n5(234.0, 36.12496062992126);
      var2.e2().l6(5);
      var2.setAlternativeText("");
      var2.setName(var1);
      var2.n5((byte)0, (byte)2, (byte)6, 2L, false);
      var2.getAutoShapeLock().setGroupingLocked(true);
      TextFrame var4 = var2.x8();
      TextFrameFormat var5 = (TextFrameFormat)var4.getTextFrameFormat();
      i6f.n5(var5);
      var5.setAnchoringType((byte)2);
      IParagraphFormat var6 = var5.h0().l6(0);
      var6.setAlignment(0);
      var6.getDefaultPortionFormat().setFontHeight(12.0F);
      return var2;
   }

   static AutoShape k5(MasterHandoutSlide var0, String var1) {
      AutoShape var2 = ((ShapeCollection)var0.k5.getShapes()).y4();
      var2.u6();
      o4f var3 = var2.R_();
      var3.n5(new e4c(305.87503937007875, 0.0));
      var2.n5(234.0, 36.12503937007874);
      var2.e2().l6(5);
      var2.setAlternativeText("");
      var2.setName(var1);
      var2.n5((byte)0, (byte)2, (byte)4, 1L, false);
      var2.getAutoShapeLock().setGroupingLocked(true);
      TextFrame var4 = var2.x8();
      TextFrameFormat var5 = (TextFrameFormat)var4.getTextFrameFormat();
      i6f.n5(var5);
      IParagraphFormat var6 = var5.h0().l6(0);
      var6.setAlignment(2);
      var6.getDefaultPortionFormat().setFontHeight(12.0F);
      var2.getTextFrame().setText(com.aspose.slides.ms.System.j5.s7().m1());
      var2.getTextFrame().getParagraphs().get_Item(0).getPortions().get_Item(0).addField("datetimeFigureOut");
      return var2;
   }

   static AutoShape u3(MasterHandoutSlide var0, String var1) {
      AutoShape var2 = ((ShapeCollection)var0.k5.getShapes()).y4();
      var2.u6();
      o4f var3 = var2.R_();
      var3.n5(new e4c(305.87503937007875, 683.8750393700788));
      var2.n5(234.0, 36.12496062992126);
      var2.e2().l6(5);
      var2.setAlternativeText("");
      var2.setName(var1);
      var2.n5((byte)0, (byte)2, (byte)5, 3L, false);
      var2.getAutoShapeLock().setGroupingLocked(true);
      TextFrame var4 = var2.x8();
      TextFrameFormat var5 = (TextFrameFormat)var4.getTextFrameFormat();
      i6f.n5(var5);
      var5.setAnchoringType((byte)2);
      IParagraphFormat var6 = var5.h0().l6(0);
      var6.setAlignment(2);
      var6.getDefaultPortionFormat().setFontHeight(12.0F);
      var2.getTextFrame().setText("‹#›");
      var2.getTextFrame().getParagraphs().get_Item(0).getPortions().get_Item(0).getPortionFormat().setSmartTagClean(false);
      var2.getTextFrame().getParagraphs().get_Item(0).getPortions().get_Item(0).addField("slidenum");
      return var2;
   }
}
