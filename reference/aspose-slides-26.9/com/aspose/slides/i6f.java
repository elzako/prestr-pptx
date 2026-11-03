package com.aspose.slides;

final class i6f extends DomObject<Presentation> implements IMasterNotesSlideManager {
   static final c0u n5 = new c0u(91440.0, 45720.0, 91440.0, 45720.0);
   private MasterNotesSlide l6;

   @Override
   public final IMasterNotesSlide getMasterNotesSlide() {
      return this.l6;
   }

   @Override
   public final IMasterNotesSlide setDefaultMasterNotesSlide() {
      this.l6 = new MasterNotesSlide(this);
      MasterTheme var1 = new MasterTheme(this.u9);
      b2y.n5(var1);
      this.l6.getThemeManager().setOverrideTheme(var1);
      this.l6.getThemeManager().setOverrideThemeEnabled(true);
      return this.l6;
   }

   @Override
   public final void removeMasterNotesSlide() {
      this.l6 = null;
   }

   final MasterNotesSlide n5() {
      this.l6 = new MasterNotesSlide(this);
      return this.l6;
   }

   i6f(Presentation var1) {
      super(var1);
   }

   final void l6() {
      Background var1 = (Background)this.l6.getBackground();
      var1.setType((byte)0);
      var1.u3().n5(1001L);
      var1.getStyleColor().setSchemeColor(0);
      o4f var2 = this.l6.k5.R_();
      var2.n5(e4c.k5.u9());
      this.l6.k5.k5(e4c.k5.u9());
      this.l6.k5.n5(e4c.k5.u9());
      this.l6.k5.l6(e4c.k5.u9());
      AutoShape var3 = n5(this.l6, "Header 1");
      var3 = k5(this.l6, "DateTime 2");
      var3 = ((ShapeCollection)this.l6.k5.getShapes()).y4();
      var3.u6();
      o4f var4 = var3.R_();
      if (this.l6.getPresentation().getSlideSize().getType() == 2) {
         var4.n5(new e4c(75.25, 97.25));
         var3.n5(379.0, 262.37503937007875);
      } else {
         com.aspose.slides.internal.o9b.f2 var5 = ((NotesSize)this.l6.getPresentation().getNotesSize()).n5().a6();
         com.aspose.slides.internal.o9b.f2 var6 = ((SlideSize)this.l6.getPresentation().getSlideSize()).n5().a6();
         double var7 = var6.l6() * 243.0 / var6.k5();
         double var9 = (var5.l6() - var7) / 2.0;
         var4.n5(new e4c(var9, 90.0));
         var3.n5(var7, 243.0);
      }

      var3.e2().l6(5);
      var3.setAlternativeText("");
      var3.setName("SlideImage 3");
      var3.n5((byte)0, (byte)0, (byte)14, 2L, false);
      var3.getAutoShapeLock().setGroupingLocked(true);
      var3.getAutoShapeLock().setRotateLocked(true);
      var3.getAutoShapeLock().setAspectRatioLocked(true);
      var3.getFillFormat().setFillType((byte)0);
      var3.getLineFormat().setWidth(1.0);
      var3.getLineFormat().getFillFormat().setFillType((byte)1);
      var3.getLineFormat().getFillFormat().getSolidFillColor().setPresetColor(7);
      TextFrame var24 = var3.x8();
      TextFrameFormat var26 = (TextFrameFormat)var24.getTextFrameFormat();
      n5(var26);
      var26.setAnchoringType((byte)1);
      var3 = ((ShapeCollection)this.l6.k5.getShapes()).y4();
      var3.u6();
      var4 = var3.R_();
      if (this.l6.getPresentation().getSlideSize().getType() == 2) {
         var4.n5(new e4c(53.0, 374.12503937007875));
         var3.n5(423.5, 306.25);
      } else {
         var4.n5(new e4c(54.0, 346.5));
         var3.n5(432.0, 283.5);
      }

      var3.e2().l6(5);
      var3.setAlternativeText("");
      var3.setName("Notes 4");
      var3.n5((byte)0, (byte)2, (byte)1, 3L, false);
      var3.getAutoShapeLock().setGroupingLocked(true);
      var24 = var3.x8();
      var26 = (TextFrameFormat)var24.getTextFrameFormat();
      var26.h0().getDefaultParagraphFormat().getDefaultPortionFormat().setFontHeight(12.0F);
      n5(var26);
      Paragraph var11 = new Paragraph();
      var11.setText("First Level");
      var3.getTextFrame().getParagraphs().add(var11);
      var11.getParagraphFormat().setDepth((short)0);
      var11.getPortions().get_Item(0).getPortionFormat().setSmartTagClean(false);
      var11 = new Paragraph();
      var11.setText("Second Level");
      var3.getTextFrame().getParagraphs().add(var11);
      var11.getParagraphFormat().setDepth((short)1);
      var11.getPortions().get_Item(0).getPortionFormat().setSmartTagClean(false);
      var11 = new Paragraph();
      var11.setText("Third level");
      var3.getTextFrame().getParagraphs().add(var11);
      var11.getParagraphFormat().setDepth((short)2);
      var11.getPortions().get_Item(0).getPortionFormat().setSmartTagClean(false);
      var11 = new Paragraph();
      var11.setText("Fourth level");
      var3.getTextFrame().getParagraphs().add(var11);
      var11.getParagraphFormat().setDepth((short)3);
      var11.getPortions().get_Item(0).getPortionFormat().setSmartTagClean(false);
      var11 = new Paragraph();
      var11.setText("Fifth level");
      var3.getTextFrame().getParagraphs().add(var11);
      var11.getParagraphFormat().setDepth((short)4);
      var11.getPortions().get_Item(0).getPortionFormat().setSmartTagClean(false);
      var26.h0().n5(new com.aspose.slides.ms.System.o5<>(2));
      var26.a6().n5(new com.aspose.slides.ms.System.o5<>(2));
      var3 = l6(this.l6, "Footer 5");
      var3 = u3(this.l6, "SlideNumber 6");
      TextStyle var12 = (TextStyle)this.l6.getNotesStyle();
      var12.h0();
      var12.n5(1);
      ParagraphFormat var13 = (ParagraphFormat)var12.getLevel(0);
      var13.setMarginLeft(0.0F);
      var13.setAlignment(0);
      var13.setDefaultTabSize(72.0F);
      var13.setRightToLeft((byte)0);
      var13.setEastAsianLineBreak((byte)1);
      var13.setLatinLineBreak((byte)0);
      var13.setHangingPunctuation((byte)1);
      PortionFormat var14 = var13.u3();
      var14.setFontHeight(12.0F);
      var14.setKerningMinimalSize(12.0F);
      var14.getFillFormat().setFillType((byte)1);
      var14.getFillFormat().getSolidFillColor().setSchemeColor(1);
      var14.setLatinFont(new FontData("+mn-lt"));
      var14.setEastAsianFont(new FontData("+mn-ea"));
      var14.setComplexScriptFont(new FontData("+mn-cs"));
      int var15 = 0;

      for (int var16 = 1; var16 < 9; var16++) {
         var15 += 457200;
         ParagraphFormat var17 = var13;
         var12.n5(var16 + 1);
         var13 = (ParagraphFormat)var12.getLevel(var16);
         var13.n5(var17);
         var13.setMarginLeft((float)(var15 / 12700.0));
      }

      this.l6.getPresentation().getViewProperties().getNotesViewProperties().setVariableScale(true);
      this.l6.t4().n5(new com.aspose.slides.internal.k4y.c1v());
      this.l6.t4().c8().l6(false);
      this.l6.t4().c8().k5(false);
      this.l6.t4().c8().u3(false);
      this.l6.t4().c8().n5(true);
   }

   static void n5(TextFrameFormat var0) {
      var0.setTextVerticalType((byte)0);
      var0.n5(c0u.l6(n5, 12700.0).l6());
      var0.l6((byte)0);
   }

   static AutoShape n5(MasterNotesSlide var0, String var1) {
      AutoShape var2 = ((ShapeCollection)var0.k5.getShapes()).y4();
      var2.u6();
      o4f var3 = var2.R_();
      var3.n5(e4c.k5.u9());
      var2.n5(229.5, 39.0);
      var2.e2().l6(5);
      var2.setAlternativeText("");
      var2.setName(var1);
      var2.n5((byte)0, (byte)2, (byte)7, 0L, false);
      var2.getAutoShapeLock().setGroupingLocked(true);
      TextFrame var4 = var2.x8();
      TextFrameFormat var5 = (TextFrameFormat)var4.getTextFrameFormat();
      n5(var5);
      IParagraphFormat var6 = var5.h0().l6(0);
      var6.setAlignment(0);
      var6.getDefaultPortionFormat().setFontHeight(12.0F);
      return var2;
   }

   static AutoShape l6(MasterNotesSlide var0, String var1) {
      com.aspose.slides.internal.o9b.f2 var2 = ((NotesSize)var0.getPresentation().getNotesSize()).n5().a6();
      AutoShape var3 = ((ShapeCollection)var0.k5.getShapes()).y4();
      var3.u6();
      o4f var4 = var3.R_();
      var4.n5(new e4c(0.0, var2.k5() - 39.0));
      var3.n5(229.5, 39.0);
      var3.e2().l6(5);
      var3.setAlternativeText("");
      var3.setName(var1);
      var3.n5((byte)0, (byte)2, (byte)6, 4L, false);
      var3.getAutoShapeLock().setGroupingLocked(true);
      TextFrame var5 = var3.x8();
      TextFrameFormat var6 = (TextFrameFormat)var5.getTextFrameFormat();
      n5(var6);
      var6.setAnchoringType((byte)2);
      IParagraphFormat var7 = var6.h0().l6(0);
      var7.setAlignment(0);
      var7.getDefaultPortionFormat().setFontHeight(12.0F);
      return var3;
   }

   static AutoShape k5(MasterNotesSlide var0, String var1) {
      com.aspose.slides.internal.o9b.f2 var2 = ((NotesSize)var0.getPresentation().getNotesSize()).n5().a6();
      AutoShape var3 = ((ShapeCollection)var0.k5.getShapes()).y4();
      var3.u6();
      o4f var4 = var3.R_();
      var4.n5(new e4c(var2.l6() - 229.5, 0.0));
      var3.n5(229.5, 39.0);
      var3.e2().l6(5);
      var3.setAlternativeText("");
      var3.setName(var1);
      var3.n5((byte)0, (byte)0, (byte)4, 1L, false);
      var3.getAutoShapeLock().setGroupingLocked(true);
      TextFrame var5 = var3.x8();
      TextFrameFormat var6 = (TextFrameFormat)var5.getTextFrameFormat();
      n5(var6);
      IParagraphFormat var7 = var6.h0().l6(0);
      var7.setAlignment(2);
      var7.getDefaultPortionFormat().setFontHeight(12.0F);
      var3.getTextFrame().setText(com.aspose.slides.ms.System.j5.s7().m1());
      var3.getTextFrame().getParagraphs().get_Item(0).getPortions().get_Item(0).addField("datetimeFigureOut");
      return var3;
   }

   static AutoShape u3(MasterNotesSlide var0, String var1) {
      com.aspose.slides.internal.o9b.f2 var2 = ((NotesSize)var0.getPresentation().getNotesSize()).n5().a6();
      AutoShape var3 = ((ShapeCollection)var0.k5.getShapes()).y4();
      var3.u6();
      o4f var4 = var3.R_();
      var4.n5(new e4c(var2.l6() - 229.5, var2.k5() - 39.0));
      var3.n5(229.5, 39.0);
      var3.e2().l6(5);
      var3.setAlternativeText("");
      var3.setName(var1);
      var3.n5((byte)0, (byte)2, (byte)5, 5L, false);
      var3.getAutoShapeLock().setGroupingLocked(true);
      TextFrame var5 = var3.x8();
      TextFrameFormat var6 = (TextFrameFormat)var5.getTextFrameFormat();
      n5(var6);
      var6.setAnchoringType((byte)2);
      IParagraphFormat var7 = var6.h0().l6(0);
      var7.setAlignment(2);
      var7.getDefaultPortionFormat().setFontHeight(12.0F);
      var3.getTextFrame().setText("‹#›");
      var3.getTextFrame().getParagraphs().get_Item(0).getPortions().get_Item(0).getPortionFormat().setSmartTagClean(false);
      var3.getTextFrame().getParagraphs().get_Item(0).getPortions().get_Item(0).addField("slidenum");
      return var3;
   }
}
