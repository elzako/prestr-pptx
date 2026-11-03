package com.aspose.slides;

import com.aspose.slides.Collections.Generic.Dictionary$Enumerator;
import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.Collections.Generic.KeyValuePair;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.Collections.Generic.List$Enumerator;
import com.aspose.slides.exceptions.ArgumentOutOfRangeException;
import com.aspose.slides.ms.System.IDisposable;

class h9j extends t0 {
   private IFontData l6;
   private final HandoutLayoutingOptions k5;
   private List<List<h4q>> u3;
   private boolean a6;

   private List<List<h4q>> h0() {
      return this.u3;
   }

   private void n5(List<List<h4q>> var1) {
      this.u3 = var1;
   }

   public final com.aspose.slides.internal.o9b.f2 l6() {
      return ((NotesSize)this.n5().getNotesSize()).n5();
   }

   public final com.aspose.slides.internal.o9b.f2 k5() {
      return ((SlideSize)this.n5().getSlideSize()).n5();
   }

   public final boolean u3() {
      return this.a6;
   }

   public final void n5(boolean var1) {
      this.a6 = var1;
   }

   public final MasterHandoutSlide a6() {
      return (MasterHandoutSlide)this.n5;
   }

   public final int u9() {
      return this.c8();
   }

   private int c8() {
      switch (this.k5.getHandout()) {
         case 0:
            return 1;
         case 1:
            return 2;
         case 2:
            return 3;
         case 3:
         case 4:
            return 4;
         case 5:
         case 6:
            return 6;
         case 7:
         case 8:
            return 9;
         default:
            throw new ArgumentOutOfRangeException(com.aspose.slides.ms.System.s3.n5(HandoutType.class, this.k5.getHandout()));
      }
   }

   public h9j(MasterHandoutSlide var1, HandoutLayoutingOptions var2, boolean var3) {
      super(var1);
      this.k5 = var2;
      this.n5(var3);
   }

   private void n5(int[] var1) {
      com.aspose.slides.internal.o9b.y1[] var2 = this.t2();
      com.aspose.slides.internal.o9b.f2 var3 = this.n5(var2[0].c8().a6()).a6();

      for (int var4 = 0; var4 < var2.length; var4++) {
         var2[var4] = new com.aspose.slides.internal.o9b.y1(
            var2[var4].x8() + (var2[var4].s7() - var3.l6()) / 2.0F, var2[var4].n3() + (var2[var4].k5() - var3.k5()) / 2.0F, var3.l6(), var3.k5()
         );
      }

      List var10 = new List();

      for (int var8 : var1) {
         if (var8 >= 1 && var8 <= this.n5().getSlides().size()) {
            Slide var9 = (Slide)this.n5().getSlides().get_Item(var8 - 1);
            if (var9 != null && (!var9.getHidden() || this.u3())) {
               var10.addItem(var8 - 1);
            }
         }
      }

      this.n5(new List<>());
      List var11 = new List();

      for (int var12 = 0; var12 < var10.size(); var12++) {
         int var13 = var12 % this.u9();
         h4q var14 = new h4q();
         var14.n5(this.n5().getSlides().get_Item((Integer)var10.get_Item(var12)));
         var14.n5(var2[var13].y4());
         if (var13 == 0 && var12 > 0) {
            this.h0().addItem(var11);
            var11 = new List();
         }

         var11.addItem(var14);
      }

      if (var11.size() > 0) {
         this.h0().addItem(var11);
      }
   }

   final void n5(
      com.aspose.slides.internal.z4.c4 var1,
      int[] var2,
      boolean var3,
      com.aspose.slides.internal.t4r.n5<com.aspose.slides.internal.k9.h0, com.aspose.slides.internal.k9.u9> var4,
      y4x var5,
      List<Integer> var6,
      InterruptionToken var7
   ) {
      com.aspose.slides.internal.o9b.f2 var8 = new com.aspose.slides.internal.o9b.f2(
         (float)com.aspose.slides.internal.n2d.t2.l6(this.l6().l6(), 72.0), (float)com.aspose.slides.internal.n2d.t2.l6(this.l6().k5(), 72.0)
      );
      s5u var9 = new s5u(this.a6(), var4, var5);
      this.n5(var2);
      int var10 = 1;
      List$Enumerator var11 = this.h0().iterator();

      try {
         while (var11.hasNext()) {
            List var12 = (List)var11.next();
            com.aspose.slides.internal.e1.w1 var13 = new com.aspose.slides.internal.e1.w1(var8.l6(), var8.k5());
            w2 var14 = new w2(
               com.aspose.slides.internal.v6g.k5.u3(this.l6().l6(), 13),
               com.aspose.slides.internal.v6g.k5.u3(this.l6().k5(), 13),
               72.0F,
               72.0F,
               var3,
               var5,
               this.n5().t9(),
               var6
            );
            this.n5(var14, var9, var5, var12, var10++);
            var13.n5(var14.y4());
            var1.l6(var13, new h9j$1(this, var7));
            if (this.k5.getPrintComments()) {
               boolean var15 = false;
               com.aspose.slides.internal.n2d.z1 var16 = new com.aspose.slides.internal.n2d.z1<>(Integer.class, IComment[].class);
               List$Enumerator var17 = var12.iterator();

               try {
                  while (var17.hasNext()) {
                     h4q var18 = (h4q)var17.next();
                     IComment[] var19 = var18.l6().getSlideComments(null);
                     if (var19.length > 0) {
                        var15 = true;
                     }

                     var16.addItem(var18.l6().getSlideNumber(), var19);
                  }
               } finally {
                  if (com.aspose.slides.internal.v6g.k5.n5(var17, IDisposable.class)) {
                     var17.dispose();
                  }
               }

               if (var15) {
                  Presentation var46 = new Presentation();

                  try {
                     var46.getSlideSize().setSize(((NotesSize)this.n5().getNotesSize()).n5().l6(), ((NotesSize)this.n5().getNotesSize()).n5().k5(), 0);
                     var46.getSlides().removeAt(0);
                     var46.getMasters().get_Item(0).getBackground().setType((byte)1);
                     ((FillFormat)var46.getMasters().get_Item(0).getBackground().getFillFormat()).n5(this.a6().getBackground().getFillFormat());
                     this.n5(var46, var16, 0, true);
                     IGenericEnumerator var47 = var46.getSlides().iterator();

                     try {
                        while (var47.hasNext()) {
                           ISlide var20 = (ISlide)var47.next();
                           var13 = new com.aspose.slides.internal.e1.w1(var8.l6(), var8.k5());
                           var14 = new w2(
                              com.aspose.slides.internal.v6g.k5.u3(this.l6().l6(), 13),
                              com.aspose.slides.internal.v6g.k5.u3(this.l6().k5(), 13),
                              72.0F,
                              72.0F,
                              var3,
                              var5,
                              this.n5().t9(),
                              var6
                           );
                           this.n5(var14, var9, var5, var20, var10++);
                           var13.n5(var14.y4());
                           var1.l6(var13, new h9j$2(this, var7));
                        }
                     } finally {
                        if (com.aspose.slides.internal.v6g.k5.n5(var47, IDisposable.class)) {
                           var47.dispose();
                        }
                     }
                  } finally {
                     if (var46 != null) {
                        var46.dispose();
                     }
                  }
               }
            }
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var11, IDisposable.class)) {
            var11.dispose();
         }
      }
   }

   final void n5(com.aspose.slides.internal.z0k.t4 var1, int[] var2, HtmlOptions var3, InterruptionToken var4) {
      Presentation var5 = this.l6(var2);

      try {
         r2k.n5(var5, var1, var2, new HtmlOptions(), var4);
      } finally {
         if (var5 != null) {
            var5.dispose();
         }
      }
   }

   final void n5(
      int[] var1,
      com.aspose.slides.internal.j9e.s7 var2,
      com.aspose.slides.internal.z0k.t4 var3,
      TiffOptions var4,
      com.aspose.slides.internal.j9e.h0 var5,
      InterruptionToken var6
   ) {
      com.aspose.slides.internal.o9b.f2 var7 = new com.aspose.slides.internal.o9b.f2(
         (float)com.aspose.slides.internal.n2d.t2.l6(this.l6().l6(), 72.0), (float)com.aspose.slides.internal.n2d.t2.l6(this.l6().k5(), 72.0)
      );
      this.n5(var1);
      int var8 = 1;
      com.aspose.slides.internal.o9b.l6 var9 = null;
      List$Enumerator var10 = this.h0().iterator();

      try {
         while (var10.hasNext()) {
            List var11 = (List)var10.next();
            var6.throwIfInterruptionRequested();
            int var12 = !var4.n5().n5()
               ? var4.n5().l6()
               : com.aspose.slides.internal.v6g.k5.u3(
                  com.aspose.slides.internal.n2d.t2.n5(var7.l6(), 96.0) * ((float)(var4.getDpiX() & 4294967295L) / 96.0F), 14
               );
            int var13 = !var4.n5().n5()
               ? var4.n5().k5()
               : com.aspose.slides.internal.v6g.k5.u3(
                  com.aspose.slides.internal.n2d.t2.n5(var7.k5(), 96.0) * ((float)(var4.getDpiY() & 4294967295L) / 96.0F), 14
               );
            com.aspose.slides.internal.o9b.p8 var14 = new com.aspose.slides.internal.o9b.p8(var12, var13);
            com.aspose.slides.internal.o9b.l6 var15 = this.n5(var14.u3(), var11, var8++);
            var15.n5((float)(var4.getDpiX() & 4294967295L), (float)(var4.getDpiY() & 4294967295L));
            if ((var4.getCompressionType() == 2 || var4.getCompressionType() == 3) && var4.getBwConversionMode() != 0) {
               var15 = l1.n5(var15, var4.getBwConversionMode());
            }

            if (var15 != null) {
               if (var9 == null) {
                  var9 = var15;
                  var5.n5()[0] = new com.aspose.slides.internal.j9e.u9(com.aspose.slides.internal.j9e.a6.h0, 18L);
                  var9.n5(var3, var2, var5);
               } else {
                  var5.n5()[0] = new com.aspose.slides.internal.j9e.u9(com.aspose.slides.internal.j9e.a6.h0, 23L);
                  var9.n5(var15, var5);
               }

               if (this.k5.getPrintComments()) {
                  boolean var16 = false;
                  com.aspose.slides.internal.n2d.z1 var17 = new com.aspose.slides.internal.n2d.z1<>(Integer.class, IComment[].class);
                  List$Enumerator var18 = var11.iterator();

                  try {
                     while (var18.hasNext()) {
                        h4q var19 = (h4q)var18.next();
                        IComment[] var20 = var19.l6().getSlideComments(null);
                        if (var20.length > 0) {
                           var16 = true;
                        }

                        var17.addItem(var19.l6().getSlideNumber(), var20);
                     }
                  } finally {
                     if (com.aspose.slides.internal.v6g.k5.n5(var18, IDisposable.class)) {
                        var18.dispose();
                     }
                  }

                  if (var16) {
                     Presentation var46 = new Presentation();

                     try {
                        var46.getSlideSize().setSize(((NotesSize)this.n5().getNotesSize()).n5().l6(), ((NotesSize)this.n5().getNotesSize()).n5().k5(), 0);
                        var46.getSlides().removeAt(0);
                        this.n5(var46, var17, 0, true);
                        IGenericEnumerator var47 = var46.getSlides().iterator();

                        try {
                           while (var47.hasNext()) {
                              ISlide var21 = (ISlide)var47.next();
                              var15 = this.n5(var14.u3(), (Slide)var21, var8++);
                              var15.n5((float)(var4.getDpiX() & 4294967295L), (float)(var4.getDpiY() & 4294967295L));
                              if ((var4.getCompressionType() == 2 || var4.getCompressionType() == 3) && var4.getBwConversionMode() != 0) {
                                 var15 = l1.n5(var15, var4.getBwConversionMode());
                              }

                              if (var15 != null) {
                                 var5.n5()[0] = new com.aspose.slides.internal.j9e.u9(com.aspose.slides.internal.j9e.a6.h0, 23L);
                                 var9.n5(var15, var5);
                              }
                           }
                        } finally {
                           if (com.aspose.slides.internal.v6g.k5.n5(var47, IDisposable.class)) {
                              var47.dispose();
                           }
                        }
                     } finally {
                        if (var46 != null) {
                           var46.dispose();
                        }
                     }
                  }
               }
            }
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var10, IDisposable.class)) {
            var10.dispose();
         }
      }

      if (var9 != null) {
         var5.n5()[0] = new com.aspose.slides.internal.j9e.u9(com.aspose.slides.internal.j9e.a6.h0, 20L);
         var9.n5(var5);
      }
   }

   private void n5(e3 var1, s5u var2, y4x var3, List<h4q> var4, int var5) {
      var3.c8 = this.k5.getPrintFrameSlide();
      ShapeFrame var6 = new ShapeFrame(
         0.0F, 0.0F, ((NotesSize)this.n5().getNotesSize()).n5().l6(), ((NotesSize)this.n5().getNotesSize()).n5().k5(), (byte)0, (byte)0, 0.0F
      );
      a1v var7 = this.n5((Background)this.a6().getBackground(), var6, var1, var2);
      if (var7 == null) {
         var7 = new a1v(com.aspose.slides.internal.o9b.c8.w4().o8());
      }

      a1v var8 = var7;
      var1.n5(var6.n5().y4(), null, var8);
      if (this.a6().getHeaderFooterManager().isSlideNumberVisible()) {
         Shape var9 = this.a6().n5((byte)5);
         ((AutoShape)var9).getTextFrame().setText(com.aspose.slides.ms.System.a3.l6(var5));
      }

      if (this.n5() != null) {
         ((BaseSlide)this.n5().getMasterHandoutSlideManager().getMasterHandoutSlide())
            .k5
            .e5()
            .n5(var1, var2, (InterruptionToken)this.n5().a6().getInterruptionToken());
      }

      List$Enumerator var14 = var4.iterator();

      try {
         while (var14.hasNext()) {
            h4q var10 = (h4q)var14.next();
            var10.n5(var1, var2, var3, this.k5.getPrintFrameSlide(), this.k5.getPrintSlideNumbers(), this.k5.getPrintComments());
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var14, IDisposable.class)) {
            var14.dispose();
         }
      }

      this.n5(var1);
   }

   private void n5(e3 var1, s5u var2, y4x var3, ISlide var4, int var5) {
      var3.c8 = false;
      ShapeFrame var6 = new ShapeFrame(
         0.0F, 0.0F, ((NotesSize)this.n5().getNotesSize()).n5().l6(), ((NotesSize)this.n5().getNotesSize()).n5().k5(), (byte)0, (byte)0, 0.0F
      );
      if (this.a6().getHeaderFooterManager().isSlideNumberVisible() && this.h0().size() > 1) {
         Shape var7 = this.a6().n5((byte)5);
         ((AutoShape)var7).getTextFrame().setText(com.aspose.slides.ms.System.a3.l6(var5));
      }

      if (this.n5() != null) {
         ((Slide)var4).t4().n5(var1, var6, var2, var3, (InterruptionToken)this.n5().a6().getInterruptionToken());
         ((BaseSlide)this.n5().getMasterHandoutSlideManager().getMasterHandoutSlide())
            .k5
            .e5()
            .n5(var1, var2, (InterruptionToken)this.n5().a6().getInterruptionToken());
      }

      this.n5(var1);
   }

   private ITable n5(IBaseSlide var1, float var2) {
      float var3 = ((SlideSize)this.n5().getSlideSize()).n5().l6();
      ITable var4 = var1.getShapes().addTable(75.0F, var2 + 50.0F, new double[]{75.0, var3 - 225.0F}, new double[]{1.0, 1.0});
      var4.mergeCells(var4.get_Item(0, 0), var4.get_Item(1, 0), false);
      var4.setStylePreset(3);
      if (this.l6 != null) {
         var4.get_Item(0, 0).getTextFrame().getParagraphs().get_Item(0).getPortions().get_Item(0).getPortionFormat().setLatinFont(this.l6);
         var4.get_Item(0, 1).getTextFrame().getParagraphs().get_Item(0).getPortions().get_Item(0).getPortionFormat().setLatinFont(this.l6);
         var4.get_Item(1, 1).getTextFrame().getParagraphs().get_Item(0).getPortions().get_Item(0).getPortionFormat().setLatinFont(this.l6);
      }

      var4.get_Item(0, 0).setMarginLeft(0.0);
      var4.get_Item(0, 1).setMarginLeft(0.0);
      var4.get_Item(1, 1).setMarginLeft(0.0);
      var4.get_Item(0, 0).getTextFrame().getParagraphs().get_Item(0).getPortions().get_Item(0).getPortionFormat().getFillFormat().setFillType((byte)1);
      ((ColorFormat)var4.get_Item(0, 0)
            .getTextFrame()
            .getParagraphs()
            .get_Item(0)
            .getPortions()
            .get_Item(0)
            .getPortionFormat()
            .getFillFormat()
            .getSolidFillColor())
         .n5(com.aspose.slides.internal.o9b.c8.j3().o8());
      var4.get_Item(0, 0).getTextFrame().getParagraphs().get_Item(0).getPortions().get_Item(0).getPortionFormat().setFontBold((byte)1);
      var4.get_Item(0, 0).getTextFrame().getParagraphs().get_Item(0).getPortions().get_Item(0).getPortionFormat().setFontHeight(12.0F);
      var4.get_Item(0, 1).getTextFrame().getParagraphs().get_Item(0).getPortions().get_Item(0).getPortionFormat().getFillFormat().setFillType((byte)1);
      ((ColorFormat)var4.get_Item(0, 1)
            .getTextFrame()
            .getParagraphs()
            .get_Item(0)
            .getPortions()
            .get_Item(0)
            .getPortionFormat()
            .getFillFormat()
            .getSolidFillColor())
         .n5(com.aspose.slides.internal.o9b.c8.j3().o8());
      var4.get_Item(0, 1).getTextFrame().getParagraphs().get_Item(0).getPortions().get_Item(0).getPortionFormat().setFontBold((byte)1);
      var4.get_Item(0, 1).getTextFrame().getParagraphs().get_Item(0).getPortions().get_Item(0).getPortionFormat().setFontHeight(10.0F);
      var4.get_Item(1, 1).getTextFrame().getParagraphs().get_Item(0).getPortions().get_Item(0).getPortionFormat().getFillFormat().setFillType((byte)1);
      ((ColorFormat)var4.get_Item(1, 1)
            .getTextFrame()
            .getParagraphs()
            .get_Item(0)
            .getPortions()
            .get_Item(0)
            .getPortionFormat()
            .getFillFormat()
            .getSolidFillColor())
         .n5(com.aspose.slides.internal.o9b.c8.m3().o8());
      var4.get_Item(1, 1).getTextFrame().getParagraphs().get_Item(0).getPortions().get_Item(0).getPortionFormat().setFontHeight(10.0F);
      return var4;
   }

   private Portion n5(String var1) {
      Portion var2 = new Portion();
      var2.getPortionFormat().setFontHeight(8.0F);
      var2.getPortionFormat().setLatinFont(this.l6);
      var2.getPortionFormat().getFillFormat().setFillType((byte)1);
      ((ColorFormat)var2.getPortionFormat().getFillFormat().getSolidFillColor()).n5(com.aspose.slides.internal.o9b.c8.j3().o8());
      var2.setText(var1);
      return var2;
   }

   private void n5(Presentation var1, com.aspose.slides.internal.n2d.z1<Integer, IComment[]> var2, int var3, boolean var4) {
      List var5 = new List();
      IGenericEnumerator var6 = var2.iterator();

      try {
         while (var6.hasNext()) {
            KeyValuePair var7 = (KeyValuePair)var6.next();
            var5.addItem(var7.getKey());
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var6, IDisposable.class)) {
            var6.dispose();
         }
      }

      ISlide var36 = var1.getSlides().addEmptySlide(var1.getLayoutSlides().get_Item(0));
      var36.getShapes().clear();
      float var8 = 0.0F;
      List$Enumerator var9 = var5.iterator();

      try {
         while (var9.hasNext()) {
            int var10 = com.aspose.slides.internal.v6g.k5.u3(var9.next(), int.class);
            IComment[] var11 = (IComment[])var2.get_Item(var10);
            if (var11.length > 0) {
               int var12 = 1;
               com.aspose.slides.internal.o9b.f2 var13 = ((SlideSize)var1.getSlideSize()).n5().a6();
               ITable var14 = this.n5(var36, var8);
               float var15 = var13.k5() - var8 - 100.0F;
               var14.get_Item(0, 0)
                  .getTextFrame()
                  .getParagraphs()
                  .get_Item(0)
                  .getPortions()
                  .get_Item(0)
                  .setText(com.aspose.slides.ms.System.d1.n5("Slide ", com.aspose.slides.ms.System.a3.l6(var10), var4 ? "" : " (continue)"));

               for (int var16 = var3; var16 < var11.length; var16++) {
                  String var17 = "";
                  String var18 = "";
                  var14.getRows().addClone(var14.getRows().get_Item(var12), false);
                  if (var4) {
                     var14.get_Item(0, var12)
                        .getTextFrame()
                        .getParagraphs()
                        .get_Item(0)
                        .getPortions()
                        .get_Item(0)
                        .setText(
                           com.aspose.slides.ms.System.d1.n5(
                              var11[var16].getAuthor().getInitials(), com.aspose.slides.ms.System.l4.l6(((Comment)var11[var16]).u3().n5())
                           )
                        );
                  }

                  var14.get_Item(1, var12).getTextFrame().getParagraphs().get_Item(0).getPortions().get_Item(0).setText(var11[var16].getText());
                  Portion var19 = this.n5(com.aspose.slides.ms.System.d1.n5(new Object[]{"\n", var11[var16].getAuthor().getName(), "; ", ((Comment)var11[var16]).n5()}));
                  var14.get_Item(1, var12).getTextFrame().getParagraphs().get_Item(0).getPortions().add(var19);
                  if (var14.getHeight() > var15) {
                     var18 = var19.getText();
                     var14.get_Item(1, var12).getTextFrame().getParagraphs().get_Item(0).getPortions().remove(var19);
                     var4 = false;
                     if (var14.getHeight() > var15) {
                        double var20 = var15 - ((Table)var14).getY() - var14.get_Item(1, var12).getOffsetY() + var8;
                        double var22 = var14.get_Item(1, var12).getHeight();
                        double var24 = var22 / var20;
                        if (!(var24 > 0.0)) {
                           var17 = var11[var16].getText();
                           var4 = true;
                           var14.getRows().removeAt(var12, false);
                        } else {
                           int var26 = com.aspose.slides.internal.v6g.k5.u3(var11[var16].getText().length() / var24, 14);
                           String var27 = com.aspose.slides.ms.System.d1.n5(var11[var16].getText(), var26);
                           int var28 = com.aspose.slides.ms.System.d1.u3(var27, " ");
                           var14.get_Item(1, var12)
                              .getTextFrame()
                              .getParagraphs()
                              .get_Item(0)
                              .getPortions()
                              .get_Item(0)
                              .setText(com.aspose.slides.ms.System.d1.l6(com.aspose.slides.ms.System.d1.n5(var27, var28)));
                           var17 = com.aspose.slides.ms.System.d1.l6(com.aspose.slides.ms.System.d1.k5(var11[var16].getText(), var28));

                           while (var14.getHeight() < var15) {
                              var28 = com.aspose.slides.ms.System.d1.u3(var17, ' ');
                              if (var28 < 0) {
                                 break;
                              }

                              var14.get_Item(1, var12)
                                 .getTextFrame()
                                 .getParagraphs()
                                 .get_Item(0)
                                 .getPortions()
                                 .get_Item(0)
                                 .setText(
                                    com.aspose.slides.ms.System.d1.n5(
                                       var14.get_Item(1, var12).getTextFrame().getParagraphs().get_Item(0).getPortions().get_Item(0).getText(),
                                       com.aspose.slides.ms.System.d1.l6(var17, 0, var28 + 1)
                                    )
                                 );
                              var17 = com.aspose.slides.ms.System.d1.k5(var17, var28 + 1);
                           }

                           while (var14.getHeight() > var15) {
                              var28 = com.aspose.slides.ms.System.d1.u3(
                                 var14.get_Item(1, var12).getTextFrame().getParagraphs().get_Item(0).getPortions().get_Item(0).getText(), " "
                              );
                              if (var28 <= 0) {
                                 break;
                              }

                              var17 = com.aspose.slides.ms.System.d1.n5(
                                 var17,
                                 0,
                                 com.aspose.slides.ms.System.d1.n5(
                                    com.aspose.slides.ms.System.d1.k5(
                                       var14.get_Item(1, var12).getTextFrame().getParagraphs().get_Item(0).getPortions().get_Item(0).getText(), var28
                                    ),
                                    " "
                                 )
                              );
                              var14.get_Item(1, var12)
                                 .getTextFrame()
                                 .getParagraphs()
                                 .get_Item(0)
                                 .getPortions()
                                 .get_Item(0)
                                 .setText(
                                    com.aspose.slides.ms.System.d1.n5(
                                       var14.get_Item(1, var12).getTextFrame().getParagraphs().get_Item(0).getPortions().get_Item(0).getText(), var28
                                    )
                                 );
                           }
                        }
                     }
                  }

                  var17 = com.aspose.slides.ms.System.d1.l6(var17);
                  if (!com.aspose.slides.ms.System.d1.n5(var18)) {
                     var11[var16].setText(var17);
                     var14.get_Item(0, 0).getCellFormat().getBorderBottom().setWidth(1.0);
                     var14.get_Item(0, 0).getCellFormat().getBorderBottom().getFillFormat().setFillType((byte)1);
                     ((ColorFormat)var14.get_Item(0, 0).getCellFormat().getBorderBottom().getFillFormat().getSolidFillColor())
                        .n5(com.aspose.slides.internal.o9b.c8.j3().o8());
                     this.n5(var1, var2, var16, var4);
                     return;
                  }

                  var4 = true;
                  var12++;
               }

               var14.get_Item(0, 0).getCellFormat().getBorderBottom().setWidth(1.0);
               var14.get_Item(0, 0).getCellFormat().getBorderBottom().getFillFormat().setFillType((byte)1);
               ((ColorFormat)var14.get_Item(0, 0).getCellFormat().getBorderBottom().getFillFormat().getSolidFillColor())
                  .n5(com.aspose.slides.internal.o9b.c8.j3().o8());
               var8 += var14.getHeight();
            }

            if (var2.containsKey(var10)) {
               var2.removeItemByKey(var10);
            }
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var9, IDisposable.class)) {
            var9.dispose();
         }
      }
   }

   private com.aspose.slides.internal.o9b.y1[] t2() {
      boolean var1;
      switch (this.k5.getHandout()) {
         case 0:
         case 1:
         case 2:
         case 3:
         case 5:
         case 7:
            var1 = true;
            break;
         case 4:
         case 6:
         case 8:
            var1 = false;
            break;
         default:
            throw new ArgumentOutOfRangeException(com.aspose.slides.ms.System.s3.n5(HandoutType.class, this.k5.getHandout()));
      }

      boolean var2 = this.l6().l6() > this.l6().k5();
      com.aspose.slides.internal.o9b.y1[] var3 = (com.aspose.slides.internal.o9b.y1[])com.aspose.slides.ms.System.u3.n5(
         com.aspose.slides.ms.System.u3.n5(com.aspose.slides.internal.v6g.k5.n5(com.aspose.slides.internal.o9b.y1.class), this.u9())
      );
      com.aspose.slides.internal.o9b.y1 var4 = com.aspose.slides.internal.o9b.y1.n5(
            new com.aspose.slides.internal.o9b.y1(new com.aspose.slides.internal.o9b.w1(), this.l6().a6()), -40.0F, -40.0F
         )
         .y4();
      switch (this.u9()) {
         case 1:
            var4.a6(var3[0]);
            break;
         case 2:
            if (var2) {
               float var12 = var4.s7() / 2.0F;
               float var19 = var4.k5();
               var3[0] = new com.aspose.slides.internal.o9b.y1(var4.x8(), var4.n3(), var12, var19);
               var3[1] = new com.aspose.slides.internal.o9b.y1(var4.x8() + var12, var4.n3(), var12, var19);
            } else {
               float var13 = var4.s7();
               float var20 = var4.k5() / 2.0F;
               var3[0] = new com.aspose.slides.internal.o9b.y1(var4.x8(), var4.n3(), var13, var20);
               var3[1] = new com.aspose.slides.internal.o9b.y1(var4.x8(), var4.n3() + var20, var13, var20);
            }
            break;
         case 3:
            if (var2) {
               float var10 = var4.s7() / 3.0F;
               float var17 = var4.k5() / 2.0F;
               var3[0] = new com.aspose.slides.internal.o9b.y1(var4.x8(), var4.n3(), var10, var17);
               var3[1] = new com.aspose.slides.internal.o9b.y1(var4.x8() + var10, var4.n3(), var10, var17);
               var3[2] = new com.aspose.slides.internal.o9b.y1(var4.x8() + var10 * 2.0F, var4.n3(), var10, var17);
            } else {
               float var11 = var4.s7() / 2.0F;
               float var18 = var4.k5() / 3.0F;
               var3[0] = new com.aspose.slides.internal.o9b.y1(var4.x8(), var4.n3(), var11, var18);
               var3[1] = new com.aspose.slides.internal.o9b.y1(var4.x8(), var4.n3() + var18, var11, var18);
               var3[2] = new com.aspose.slides.internal.o9b.y1(var4.x8(), var4.n3() + var18 * 2.0F, var11, var18);
            }
            break;
         case 4:
            float var9 = var4.s7() / 2.0F;
            float var16 = var4.k5() / 2.0F;
            if (var1) {
               var3[0] = new com.aspose.slides.internal.o9b.y1(var4.x8(), var4.n3(), var9, var16);
               var3[1] = new com.aspose.slides.internal.o9b.y1(var4.x8() + var9, var4.n3(), var9, var16);
               var3[2] = new com.aspose.slides.internal.o9b.y1(var4.x8(), var4.n3() + var16, var9, var16);
               var3[3] = new com.aspose.slides.internal.o9b.y1(var4.x8() + var9, var4.n3() + var16, var9, var16);
            } else {
               var3[0] = new com.aspose.slides.internal.o9b.y1(var4.x8(), var4.n3(), var9, var16);
               var3[1] = new com.aspose.slides.internal.o9b.y1(var4.x8(), var4.n3() + var16, var9, var16);
               var3[2] = new com.aspose.slides.internal.o9b.y1(var4.x8() + var9, var4.n3(), var9, var16);
               var3[3] = new com.aspose.slides.internal.o9b.y1(var4.x8() + var9, var4.n3() + var16, var9, var16);
            }
         case 5:
         case 7:
         case 8:
         default:
            break;
         case 6:
            if (var2) {
               float var7 = var4.s7() / 3.0F;
               float var14 = var4.k5() / 2.0F;
               if (var1) {
                  var3[0] = new com.aspose.slides.internal.o9b.y1(var4.x8(), var4.n3(), var7, var14);
                  var3[1] = new com.aspose.slides.internal.o9b.y1(var4.x8() + var7, var4.n3(), var7, var14);
                  var3[2] = new com.aspose.slides.internal.o9b.y1(var4.x8() + var7 * 2.0F, var4.n3(), var7, var14);
                  var3[3] = new com.aspose.slides.internal.o9b.y1(var4.x8(), var4.n3() + var14, var7, var14);
                  var3[4] = new com.aspose.slides.internal.o9b.y1(var4.x8() + var7, var4.n3() + var14, var7, var14);
                  var3[5] = new com.aspose.slides.internal.o9b.y1(var4.x8() + var7 * 2.0F, var4.n3() + var14, var7, var14);
               } else {
                  var3[0] = new com.aspose.slides.internal.o9b.y1(var4.x8(), var4.n3(), var7, var14);
                  var3[1] = new com.aspose.slides.internal.o9b.y1(var4.x8(), var4.n3() + var14, var7, var14);
                  var3[2] = new com.aspose.slides.internal.o9b.y1(var4.x8() + var7, var4.n3(), var7, var14);
                  var3[3] = new com.aspose.slides.internal.o9b.y1(var4.x8() + var7, var4.n3() + var14, var7, var14);
                  var3[4] = new com.aspose.slides.internal.o9b.y1(var4.x8() + var7 * 2.0F, var4.n3(), var7, var14);
                  var3[5] = new com.aspose.slides.internal.o9b.y1(var4.x8() + var7 * 2.0F, var4.n3() + var14, var7, var14);
               }
            } else {
               float var8 = var4.s7() / 2.0F;
               float var15 = var4.k5() / 3.0F;
               if (var1) {
                  var3[0] = new com.aspose.slides.internal.o9b.y1(var4.x8(), var4.n3(), var8, var15);
                  var3[1] = new com.aspose.slides.internal.o9b.y1(var4.x8() + var8, var4.n3(), var8, var15);
                  var3[2] = new com.aspose.slides.internal.o9b.y1(var4.x8(), var4.n3() + var15, var8, var15);
                  var3[3] = new com.aspose.slides.internal.o9b.y1(var4.x8() + var8, var4.n3() + var15, var8, var15);
                  var3[4] = new com.aspose.slides.internal.o9b.y1(var4.x8(), var4.n3() + var15 * 2.0F, var8, var15);
                  var3[5] = new com.aspose.slides.internal.o9b.y1(var4.x8() + var8, var4.n3() + var15 * 2.0F, var8, var15);
               } else {
                  var3[0] = new com.aspose.slides.internal.o9b.y1(var4.x8(), var4.n3(), var8, var15);
                  var3[1] = new com.aspose.slides.internal.o9b.y1(var4.x8(), var4.n3() + var15, var8, var15);
                  var3[2] = new com.aspose.slides.internal.o9b.y1(var4.x8(), var4.n3() + var15 * 2.0F, var8, var15);
                  var3[3] = new com.aspose.slides.internal.o9b.y1(var4.x8() + var8, var4.n3(), var8, var15);
                  var3[4] = new com.aspose.slides.internal.o9b.y1(var4.x8() + var8, var4.n3() + var15, var8, var15);
                  var3[5] = new com.aspose.slides.internal.o9b.y1(var4.x8() + var8, var4.n3() + var15 * 2.0F, var8, var15);
               }
            }
            break;
         case 9:
            float var5 = var4.s7() / 3.0F;
            float var6 = var4.k5() / 3.0F;
            if (var1) {
               var3[0] = new com.aspose.slides.internal.o9b.y1(var4.x8(), var4.n3(), var5, var6);
               var3[1] = new com.aspose.slides.internal.o9b.y1(var4.x8() + var5, var4.n3(), var5, var6);
               var3[2] = new com.aspose.slides.internal.o9b.y1(var4.x8() + var5 * 2.0F, var4.n3(), var5, var6);
               var3[3] = new com.aspose.slides.internal.o9b.y1(var4.x8(), var4.n3() + var6, var5, var6);
               var3[4] = new com.aspose.slides.internal.o9b.y1(var4.x8() + var5, var4.n3() + var6, var5, var6);
               var3[5] = new com.aspose.slides.internal.o9b.y1(var4.x8() + var5 * 2.0F, var4.n3() + var6, var5, var6);
               var3[6] = new com.aspose.slides.internal.o9b.y1(var4.x8(), var4.n3() + var6 * 2.0F, var5, var6);
               var3[7] = new com.aspose.slides.internal.o9b.y1(var4.x8() + var5, var4.n3() + var6 * 2.0F, var5, var6);
               var3[8] = new com.aspose.slides.internal.o9b.y1(var4.x8() + var5 * 2.0F, var4.n3() + var6 * 2.0F, var5, var6);
            } else {
               var3[0] = new com.aspose.slides.internal.o9b.y1(var4.x8(), var4.n3(), var5, var6);
               var3[1] = new com.aspose.slides.internal.o9b.y1(var4.x8(), var4.n3() + var6, var5, var6);
               var3[2] = new com.aspose.slides.internal.o9b.y1(var4.x8(), var4.n3() + var6 * 2.0F, var5, var6);
               var3[3] = new com.aspose.slides.internal.o9b.y1(var4.x8() + var5, var4.n3(), var5, var6);
               var3[4] = new com.aspose.slides.internal.o9b.y1(var4.x8() + var5, var4.n3() + var6, var5, var6);
               var3[5] = new com.aspose.slides.internal.o9b.y1(var4.x8() + var5, var4.n3() + var6 * 2.0F, var5, var6);
               var3[6] = new com.aspose.slides.internal.o9b.y1(var4.x8() + var5 * 2.0F, var4.n3(), var5, var6);
               var3[7] = new com.aspose.slides.internal.o9b.y1(var4.x8() + var5 * 2.0F, var4.n3() + var6, var5, var6);
               var3[8] = new com.aspose.slides.internal.o9b.y1(var4.x8() + var5 * 2.0F, var4.n3() + var6 * 2.0F, var5, var6);
            }
      }

      return var3;
   }

   private com.aspose.slides.internal.o9b.f2 n5(com.aspose.slides.internal.o9b.f2 var1) {
      float var2 = var1.l6();
      float var3 = var1.k5();
      float var4 = var2 / var3;
      float var5 = this.k5().l6() / this.k5().k5();
      if (var4 > var5) {
         var2 = var5 * var3;
      } else {
         var3 = var2 / var5;
      }

      return new com.aspose.slides.internal.o9b.f2(var2 - 30.0F * var5, var3 - 30.0F);
   }

   private com.aspose.slides.internal.o9b.l6 n5(com.aspose.slides.internal.o9b.p8 var1, List<h4q> var2, int var3) {
      com.aspose.slides.internal.t4r.n5 var4 = new com.aspose.slides.internal.t4r.n5<>(
         com.aspose.slides.internal.k9.h0.class, com.aspose.slides.internal.k9.u9.class
      );
      com.aspose.slides.internal.o9b.l6 var5 = new com.aspose.slides.internal.o9b.l6(var1.l6(), var1.k5(), 139273);
      var5.n5(96.0F, 96.0F);

      try {
         com.aspose.slides.internal.o9b.f2 var6 = this.l6().a6();
         r1c var7 = new r1c(var5, var6.l6(), var6.k5());

         try {
            var7.n5(
               new com.aspose.slides.internal.o9b.y1(-1.0F, -1.0F, var6.l6() + 2.0F, var6.k5() + 2.0F),
               null,
               new a1v(com.aspose.slides.internal.o9b.c8.w4().o8())
            );
            y4x var8 = new y4x();
            s5u var9 = new s5u(this.a6(), var4, var8);
            this.n5(var7, var9, var8, var2, var3);
         } finally {
            if (var7 != null) {
               var7.dispose();
            }
         }

         return var5;
      } catch (RuntimeException var37) {
         var5.dispose();
         throw var37;
      } finally {
         Dictionary$Enumerator var13 = var4.l6().iterator();

         try {
            while (var13.hasNext()) {
               KeyValuePair var14 = (KeyValuePair)var13.next();
               if (!this.n5().c4().n5((com.aspose.slides.internal.k9.h0)var14.getKey())) {
                  ((com.aspose.slides.internal.k9.u9)var14.getValue()).k5().dispose();
                  var4.l6(var14.getKey());
               }
            }
         } finally {
            if (com.aspose.slides.internal.v6g.k5.n5(var13, IDisposable.class)) {
               var13.dispose();
            }
         }
      }
   }

   private com.aspose.slides.internal.o9b.l6 n5(com.aspose.slides.internal.o9b.p8 var1, Slide var2, int var3) {
      com.aspose.slides.internal.t4r.n5 var4 = new com.aspose.slides.internal.t4r.n5<>(
         com.aspose.slides.internal.k9.h0.class, com.aspose.slides.internal.k9.u9.class
      );
      com.aspose.slides.internal.o9b.l6 var5 = new com.aspose.slides.internal.o9b.l6(var1.l6(), var1.k5(), 139273);
      var5.n5(96.0F, 96.0F);

      try {
         com.aspose.slides.internal.o9b.f2 var6 = this.l6().a6();
         r1c var7 = new r1c(var5, var6.l6(), var6.k5());

         try {
            var7.n5(
               new com.aspose.slides.internal.o9b.y1(-1.0F, -1.0F, var6.l6() + 2.0F, var6.k5() + 2.0F),
               null,
               new a1v(com.aspose.slides.internal.o9b.c8.w4().o8())
            );
            y4x var8 = new y4x();
            s5u var9 = new s5u(this.a6(), var4, var8);
            this.n5(var7, var9, var8, var2, var3);
         } finally {
            if (var7 != null) {
               var7.dispose();
            }
         }

         return var5;
      } catch (RuntimeException var37) {
         var5.dispose();
         throw var37;
      } finally {
         Dictionary$Enumerator var13 = var4.l6().iterator();

         try {
            while (var13.hasNext()) {
               KeyValuePair var14 = (KeyValuePair)var13.next();
               if (!this.n5().c4().n5((com.aspose.slides.internal.k9.h0)var14.getKey())) {
                  ((com.aspose.slides.internal.k9.u9)var14.getValue()).k5().dispose();
                  var4.l6(var14.getKey());
               }
            }
         } finally {
            if (com.aspose.slides.internal.v6g.k5.n5(var13, IDisposable.class)) {
               var13.dispose();
            }
         }
      }
   }

   static com.aspose.slides.internal.o9b.l6[] n5(Presentation var0, IRenderingOptions var1) {
      return n5(var0, var1, 1.0F, 1.0F);
   }

   static com.aspose.slides.internal.o9b.l6[] n5(Presentation var0, IRenderingOptions var1, float var2, float var3) {
      boolean var4 = false;
      MasterHandoutSlide var5 = (MasterHandoutSlide)var0.getMasterHandoutSlideManager().getMasterHandoutSlide();
      if (var5 == null) {
         var4 = true;
         var5 = (MasterHandoutSlide)var0.getMasterHandoutSlideManager().setDefaultMasterHandoutSlide();
      }

      int[] var6 = new int[var0.getSlides().size()];

      for (int var7 = 0; var7 < var6.length; var7++) {
         var6[var7] = var7 + 1;
      }

      h9j var9 = new h9j(var5, (HandoutLayoutingOptions)var1.getSlidesLayoutOptions(), false);
      com.aspose.slides.internal.o9b.l6[] var8 = var9.n5(var6, var2, var3);
      if (var4) {
         var0.getMasterHandoutSlideManager().removeMasterHandoutSlide();
      }

      return var8;
   }

   static com.aspose.slides.internal.o9b.l6[] n5(Presentation var0, IRenderingOptions var1, com.aspose.slides.internal.o9b.p8 var2) {
      boolean var3 = false;
      MasterHandoutSlide var4 = (MasterHandoutSlide)var0.getMasterHandoutSlideManager().getMasterHandoutSlide();
      if (var4 == null) {
         var3 = true;
         var4 = (MasterHandoutSlide)var0.getMasterHandoutSlideManager().setDefaultMasterHandoutSlide();
      }

      int[] var5 = new int[var0.getSlides().size()];

      for (int var6 = 0; var6 < var5.length; var6++) {
         var5[var6] = var6 + 1;
      }

      h9j var8 = new h9j(var4, (HandoutLayoutingOptions)var1.getSlidesLayoutOptions(), false);
      com.aspose.slides.internal.o9b.l6[] var7 = var8.n5(var5, var2.u3());
      if (var3) {
         var0.getMasterHandoutSlideManager().removeMasterHandoutSlide();
      }

      return var7;
   }

   private com.aspose.slides.internal.o9b.l6[] n5(int[] var1, com.aspose.slides.internal.o9b.p8 var2) {
      List var3 = new List();
      com.aspose.slides.internal.o9b.p8 var4 = var2.u3();
      InterruptionToken var5 = (InterruptionToken)this.n5().a6().getInterruptionToken();
      c2m var6 = this.n5().j5();

      try {
         this.n5(var1);
         int var7 = 1;
         List$Enumerator var8 = this.h0().iterator();

         try {
            while (var8.hasNext()) {
               List var9 = (List)var8.next();
               var5.throwIfInterruptionRequested();
               var3.addItem(this.n5(var4.u3(), var9, var7++));
               if (this.k5.getPrintComments()) {
                  boolean var10 = false;
                  com.aspose.slides.internal.n2d.z1 var11 = new com.aspose.slides.internal.n2d.z1<>(Integer.class, IComment[].class);
                  List$Enumerator var12 = var9.iterator();

                  try {
                     while (var12.hasNext()) {
                        h4q var13 = (h4q)var12.next();
                        IComment[] var14 = var13.l6().getSlideComments(null);
                        if (var14.length > 0) {
                           var10 = true;
                        }

                        var11.addItem(var13.l6().getSlideNumber(), var14);
                     }
                  } finally {
                     if (com.aspose.slides.internal.v6g.k5.n5(var12, IDisposable.class)) {
                        var12.dispose();
                     }
                  }

                  if (var10) {
                     Presentation var50 = new Presentation();

                     try {
                        var50.getSlideSize().setSize(((NotesSize)this.n5().getNotesSize()).n5().l6(), ((NotesSize)this.n5().getNotesSize()).n5().k5(), 0);
                        var50.getSlides().removeAt(0);
                        this.n5(var50, var11, 0, true);
                        IGenericEnumerator var51 = var50.getSlides().iterator();

                        try {
                           while (var51.hasNext()) {
                              ISlide var15 = (ISlide)var51.next();
                              var3.addItem(this.n5(var4.u3(), (Slide)var15, var7++));
                           }
                        } finally {
                           if (com.aspose.slides.internal.v6g.k5.n5(var51, IDisposable.class)) {
                              var51.dispose();
                           }
                        }
                     } finally {
                        if (var50 != null) {
                           var50.dispose();
                        }
                     }
                  }
               }
            }
         } finally {
            if (com.aspose.slides.internal.v6g.k5.n5(var8, IDisposable.class)) {
               var8.dispose();
            }
         }
      } finally {
         if (var6 != null) {
            var6.dispose();
         }
      }

      return (com.aspose.slides.internal.o9b.l6[])var3.toArray(new com.aspose.slides.internal.o9b.l6[0]);
   }

   private com.aspose.slides.internal.o9b.l6[] n5(int[] var1, float var2, float var3) {
      com.aspose.slides.internal.o9b.p8 var4 = new com.aspose.slides.internal.o9b.p8(
         com.aspose.slides.internal.v6g.k5.u3(this.l6().l6() * var2, 13), com.aspose.slides.internal.v6g.k5.u3(this.l6().k5() * var3, 13)
      );
      return this.n5(var1, var4.u3());
   }

   private Presentation l6(int[] var1) {
      this.n5(var1);
      Presentation var2 = new Presentation();
      var2.getSlideSize().setSize(((NotesSize)this.n5().getNotesSize()).n5().l6(), ((NotesSize)this.n5().getNotesSize()).n5().k5(), 1);
      var2.getSlides().removeAt(0);
      IMasterSlide var3 = var2.getMasters().get_Item(0);
      var3.getShapes().clear();
      IGenericEnumerator var4 = this.a6().getShapes().iterator();

      try {
         while (var4.hasNext()) {
            IShape var5 = (IShape)var4.next();
            if (var5.getPlaceholder() == null || var5.getPlaceholder().getType() != 7) {
               var3.getShapes().addClone(var5);
            }
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var4, IDisposable.class)) {
            var4.dispose();
         }
      }

      var3.getBackground().setType(this.a6().getBackground().getType());
      ((FillFormat)var3.getBackground().getFillFormat()).n5(this.a6().getBackground().getFillFormat());
      ILayoutSlide var47 = var2.getLayoutSlides().get_Item(0);
      var47.getShapes().clear();
      IGenericEnumerator var6 = var3.getShapes().iterator();

      try {
         while (var6.hasNext()) {
            IShape var7 = (IShape)var6.next();
            var47.getShapes().addClone(var7);
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var6, IDisposable.class)) {
            var6.dispose();
         }
      }

      List$Enumerator var48 = this.h0().iterator();

      try {
         while (var48.hasNext()) {
            List var8 = (List)var48.next();
            ISlide var9 = var2.getSlides().addEmptySlide(var47);
            com.aspose.slides.internal.n2d.z1 var10 = new com.aspose.slides.internal.n2d.z1<>(Integer.class, IComment[].class);
            List$Enumerator var11 = var8.iterator();

            try {
               while (var11.hasNext()) {
                  h4q var12 = (h4q)var11.next();
                  var12.n5(var9, this.k5.getPrintFrameSlide(), this.k5.getPrintSlideNumbers(), this.k5.getPrintComments());
                  if (this.k5.getPrintComments()) {
                     IComment[] var13 = var12.l6().getSlideComments(null);
                     if (var13.length > 0) {
                        var10.addItem(var12.l6().getSlideNumber(), var13);
                     }
                  }
               }
            } finally {
               if (com.aspose.slides.internal.v6g.k5.n5(var11, IDisposable.class)) {
                  var11.dispose();
               }
            }

            if (var10.size() > 0) {
               this.n5(var2, var10, 0, true);
            }
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var48, IDisposable.class)) {
            var48.dispose();
         }
      }

      IGenericEnumerator var49 = var2.getSlides().iterator();

      try {
         while (var49.hasNext()) {
            ISlide var50 = (ISlide)var49.next();
            var50.getHeaderFooterManager().setFooterVisibility(this.a6().getHeaderFooterManager().isFooterVisible());
            var50.getHeaderFooterManager().setDateTimeVisibility(this.a6().getHeaderFooterManager().isDateTimeVisible());
            var50.getHeaderFooterManager().setSlideNumberVisibility(this.a6().getHeaderFooterManager().isSlideNumberVisible());
            if (this.a6().getHeaderFooterManager().isHeaderVisible()) {
               AutoShape var51 = com.aspose.slides.internal.v6g.k5.n5(this.a6().n5((byte)7), AutoShape.class);
               if (var51 != null) {
                  IShape var52 = var50.getShapes().addClone(var51);
                  var52.removePlaceholder();
               }
            }
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var49, IDisposable.class)) {
            var49.dispose();
         }
      }

      return var2;
   }
}
