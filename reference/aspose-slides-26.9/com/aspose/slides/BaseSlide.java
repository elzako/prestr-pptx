package com.aspose.slides;

import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.Collections.Generic.List$Enumerator;
import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.exceptions.Exception;
import com.aspose.slides.ms.System.IDisposable;
import java.util.Iterator;

public abstract class BaseSlide implements IBaseSlide, q7p, r0g {
   private r0g u9;
   private IPresentationComponent h0;
   private long c8 = 1L;
   private long t2 = 1000L;
   private int s7;
   private String x8;
   private final Background n3;
   private final CustomData y4;
   private final ControlCollection e2;
   private final AnimationTimeLine t9;
   private final long z1;
   private HyperlinkQueries t4;
   SlideShowTransition n5;
   p6d l6;
   GroupShape k5;
   private com.aspose.slides.ms.System.i9 q0 = new com.aspose.slides.ms.System.i9(1219033472);
   private long z3;
   private t0 m1;
   static final BaseSlide[] u3 = new BaseSlide[0];
   static final Shape[] a6 = new Shape[0];

   final long n5() {
      return this.z3;
   }

   final void n5(long var1) {
      this.z3 = var1;
   }

   BaseSlide(r0g parentImmediate) {
      this.u9 = parentImmediate;
      this.z1 = this.z1().m1();
      this.y4 = new CustomData(this);
      this.e2 = new ControlCollection(this);
      this.t9 = new AnimationTimeLine(this);
      this.n3 = new Background(this);
      this.k5 = new GroupShape(this);
      this.k5.u6();
      this.l6 = new p6d(this);
      this.s7 = 1;
   }

   final void n5(t0 var1) {
      if (var1 == null) {
         throw new ArgumentNullException("view");
      }

      this.l6(var1);
   }

   final t0 l6() {
      return this.m1;
   }

   private void l6(t0 var1) {
      this.m1 = var1;
   }

   abstract o8 k5();

   abstract f1 u3();

   final com.aspose.slides.ms.System.i9 a6() {
      return this.q0;
   }

   @Override
   public final IShapeCollection getShapes() {
      return this.k5.getShapes();
   }

   @Override
   public final IControlCollection getControls() {
      return this.e2;
   }

   @Override
   public String getName() {
      return this.x8;
   }

   @Override
   public void setName(String value) {
      this.x8 = value;
   }

   @Override
   public final long getSlideId() {
      return this.k5().u3();
   }

   private String n5(boolean var1) {
      e1e var2 = new e1e();
      String var3 = this.n5(var2.n5(this), !var1);
      if (var1) {
         var3 = com.aspose.slides.ms.System.d1.n5(
            var3,
            com.aspose.slides.ms.System.d1.n5(
               "|",
               new String[]{
                  com.aspose.slides.ms.System.l4.n5(this.getSlideId(), com.aspose.slides.internal.x7n.l6.k5()),
                  this.getPresentation().getDocumentProperties().getTitle(),
                  com.aspose.slides.ms.System.a3.n5(this.getPresentation().getDocumentProperties().getRevisionNumber(), com.aspose.slides.internal.x7n.l6.k5()),
                  ((DocumentProperties)this.getPresentation().getDocumentProperties()).l6().n5("YYYYMMDDHHmmss"),
                  ((DocumentProperties)this.getPresentation().getDocumentProperties()).k5().n5("YYYYMMDDHHmmss"),
                  com.aspose.slides.ms.System.a3.n5(this.getPresentation().getSlides().size(), com.aspose.slides.internal.x7n.l6.k5())
               }
            )
         );
      }

      byte[] var4 = com.aspose.slides.internal.l7h.j5.z1().u3(var3);
      com.aspose.slides.internal.o8m.h6 var5 = new com.aspose.slides.internal.o8m.h6();

      try {
         byte[] var6 = var5.l6(var4);
         return com.aspose.slides.ms.System.d1.u9(com.aspose.slides.ms.System.d1.n5(com.aspose.slides.ms.System.x8.n5(var6), "-", ""));
      } finally {
         if (var5 != null) {
            var5.dispose();
         }
      }
   }

   @Override
   public final boolean equals(IBaseSlide slide) {
      BaseSlide var2 = com.aspose.slides.internal.v6g.k5.n5(slide, BaseSlide.class);
      return var2 == null ? false : com.aspose.slides.ms.System.d1.a6(this.n5(false), var2.n5(false));
   }

   @Override
   public void joinPortionsWithSameFormatting() {
      this.joinPortionsWithSameFormatting(this.getShapes());
   }

   public void joinPortionsWithSameFormatting(IShapeCollection collection) {
      IGenericEnumerator var2 = collection.iterator();

      try {
         while (var2.hasNext()) {
            IShape var3 = (IShape)var2.next();
            ISmartArt var4 = com.aspose.slides.internal.v6g.k5.n5(var3, ISmartArt.class);
            if (var4 != null) {
               IGenericEnumerator var5 = var4.getAllNodes().iterator();

               try {
                  while (var5.hasNext()) {
                     SmartArtNode var6 = (SmartArtNode)var5.next();
                     if (var6.getTextFrame() != null) {
                        var6.getTextFrame().joinPortionsWithSameFormatting();
                     }
                  }
               } finally {
                  if (com.aspose.slides.internal.v6g.k5.n5(var5, IDisposable.class)) {
                     var5.dispose();
                  }
               }
            }

            IAutoShape var59 = com.aspose.slides.internal.v6g.k5.n5(var3, IAutoShape.class);
            if (var59 != null && var59.getTextFrame() != null) {
               var59.getTextFrame().joinPortionsWithSameFormatting();
            }

            ITable var60 = com.aspose.slides.internal.v6g.k5.n5(var3, ITable.class);
            if (var60 != null) {
               for (int var7 = 0; var7 < var60.getRows().size(); var7++) {
                  for (int var8 = 0; var8 < var60.getColumns().size(); var8++) {
                     var60.get_Item(var8, var7).getTextFrame().joinPortionsWithSameFormatting();
                  }
               }
            }

            IChart var61 = com.aspose.slides.internal.v6g.k5.n5(var3, IChart.class);
            if (var61 != null) {
               if (var61.getChartTitle().getTextFrameForOverriding() != null) {
                  var61.getChartTitle().getTextFrameForOverriding().joinPortionsWithSameFormatting();
               }

               if (var61.getAxes().getHorizontalAxis() != null && var61.getAxes().getHorizontalAxis().getTitle().getTextFrameForOverriding() != null) {
                  var61.getAxes().getHorizontalAxis().getTitle().getTextFrameForOverriding().joinPortionsWithSameFormatting();
               }

               if (var61.getAxes().getSecondaryHorizontalAxis() != null
                  && var61.getAxes().getSecondaryHorizontalAxis().getTitle().getTextFrameForOverriding() != null) {
                  var61.getAxes().getSecondaryHorizontalAxis().getTitle().getTextFrameForOverriding().joinPortionsWithSameFormatting();
               }

               if (var61.getAxes().getSecondaryVerticalAxis() != null
                  && var61.getAxes().getSecondaryVerticalAxis().getTitle().getTextFrameForOverriding() != null) {
                  var61.getAxes().getSecondaryVerticalAxis().getTitle().getTextFrameForOverriding().joinPortionsWithSameFormatting();
               }

               if (var61.getAxes().getSeriesAxis() != null && var61.getAxes().getSeriesAxis().getTitle().getTextFrameForOverriding() != null) {
                  var61.getAxes().getSeriesAxis().getTitle().getTextFrameForOverriding().joinPortionsWithSameFormatting();
               }

               if (var61.getAxes().getVerticalAxis() != null && var61.getAxes().getVerticalAxis().getTitle().getTextFrameForOverriding() != null) {
                  var61.getAxes().getVerticalAxis().getTitle().getTextFrameForOverriding().joinPortionsWithSameFormatting();
               }

               IGenericEnumerator var62 = var61.getChartData().getSeries().iterator();

               try {
                  while (var62.hasNext()) {
                     IChartSeries var9 = (IChartSeries)var62.next();
                     if (var9.getTrendLines() != null) {
                        IGenericEnumerator var10 = var9.getTrendLines().iterator();

                        try {
                           while (var10.hasNext()) {
                              ITrendline var11 = (ITrendline)var10.next();
                              if (var11.getTextFrameForOverriding() != null) {
                                 var11.getTextFrameForOverriding().joinPortionsWithSameFormatting();
                              }
                           }
                        } finally {
                           if (com.aspose.slides.internal.v6g.k5.n5(var10, IDisposable.class)) {
                              var10.dispose();
                           }
                        }
                     }

                     IGenericEnumerator var64 = var9.getDataPoints().iterator();

                     try {
                        while (var64.hasNext()) {
                           IChartDataPoint var65 = (IChartDataPoint)var64.next();
                           if (var65.getLabel() != null && var65.getLabel().getTextFrameForOverriding() != null) {
                              var65.getLabel().getTextFrameForOverriding().joinPortionsWithSameFormatting();
                           }
                        }
                     } finally {
                        if (com.aspose.slides.internal.v6g.k5.n5(var64, IDisposable.class)) {
                           var64.dispose();
                        }
                     }

                     IGenericEnumerator var66 = var9.getLabels().iterator();

                     try {
                        while (var66.hasNext()) {
                           IDataLabel var12 = (IDataLabel)var66.next();
                           if (var12.getTextFrameForOverriding() != null) {
                              var12.getTextFrameForOverriding().joinPortionsWithSameFormatting();
                           }
                        }
                     } finally {
                        if (com.aspose.slides.internal.v6g.k5.n5(var66, IDisposable.class)) {
                           var66.dispose();
                        }
                     }
                  }
               } finally {
                  if (com.aspose.slides.internal.v6g.k5.n5(var62, IDisposable.class)) {
                     var62.dispose();
                  }
               }
            }

            IGroupShape var63 = com.aspose.slides.internal.v6g.k5.n5(var3, IGroupShape.class);
            if (var63 != null) {
               this.joinPortionsWithSameFormatting(var63.getShapes());
            }
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var2, IDisposable.class)) {
            var2.dispose();
         }
      }
   }

   final long u9() {
      return this.z1;
   }

   final ColorFormat n5(int var1) {
      BaseThemeManager var2 = (BaseThemeManager)this.h0();
      byte var3 = var2.k5().n5(var1);
      s8u var4 = (s8u)this.createThemeEffective();
      return var4.l6().l6(var3);
   }

   @Override
   public final IThemeEffectiveData createThemeEffective() {
      return this.h0().createThemeEffective();
   }

   final IThemeManager h0() {
      return Theme.n5(this);
   }

   @Override
   public final ICustomData getCustomData() {
      return this.y4;
   }

   @Override
   public final IAnimationTimeLine getTimeline() {
      return this.t9;
   }

   @Override
   public ISlideShowTransition getSlideShowTransition() {
      return this.n5;
   }

   @Override
   public final IBackground getBackground() {
      return this.n3;
   }

   @Override
   public final IHyperlinkQueries getHyperlinkQueries() {
      if (this.t4 == null) {
         this.t4 = new HyperlinkQueries(this);
      }

      return this.t4;
   }

   @Override
   public abstract boolean getShowMasterShapes();

   @Override
   public abstract void setShowMasterShapes(boolean var1);

   final List<Shape> c8() {
      List var1 = new List();
      this.n5(this.getShapes(), var1);
      return var1;
   }

   private void n5(IShapeCollection var1, List<Shape> var2) {
      IGenericEnumerator var3 = var1.iterator();

      try {
         while (var3.hasNext()) {
            Shape var4 = (Shape)var3.next();
            var2.addItem(var4);
            GroupShape var5 = com.aspose.slides.internal.v6g.k5.n5(var4, GroupShape.class);
            if (var5 != null) {
               this.n5(var5.getShapes(), var2);
            }
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var3, IDisposable.class)) {
            var3.dispose();
         }
      }
   }

   final Shape n5(byte var1) {
      List var2 = this.c8();
      List$Enumerator var3 = var2.iterator();

      try {
         while (var3.hasNext()) {
            Shape var4 = (Shape)var3.next();
            if (var4.getPlaceholder() != null && var4.getPlaceholder().getType() == var1) {
               return var4;
            }
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var3, IDisposable.class)) {
            var3.dispose();
         }
      }

      return null;
   }

   final Shape l6(long var1) {
      List var3 = this.c8();
      List$Enumerator var4 = var3.iterator();

      try {
         while (var4.hasNext()) {
            Shape var5 = (Shape)var4.next();
            if (var5.getPlaceholder() != null && var5.getPlaceholder().getIndex() == var1) {
               return var5;
            }
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var4, IDisposable.class)) {
            var4.dispose();
         }
      }

      return null;
   }

   @Override
   public final IShape findShapeByAltText(String altText) {
      List var2 = this.c8();
      List$Enumerator var3 = var2.iterator();

      try {
         while (var3.hasNext()) {
            Shape var4 = (Shape)var3.next();
            String var5 = var4.getAlternativeText();
            if (var5 != null && com.aspose.slides.ms.System.d1.a6(var5, altText)) {
               return var4;
            }
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var3, IDisposable.class)) {
            var3.dispose();
         }
      }

      return null;
   }

   final void n5(ITextStyle var1) {
      List var2 = this.c8();
      List$Enumerator var3 = var2.iterator();

      try {
         while (var3.hasNext()) {
            Shape var4 = (Shape)var3.next();
            AutoShape var5 = com.aspose.slides.internal.v6g.k5.n5(var4, AutoShape.class);
            if (var5 != null
               && var5.getTextFrame() != null
               && (!var5.isTextHolder() || TextFrame.a6.l6(var5.getPlaceholder().getType()) == 0 && var5.f2().length <= 0)) {
               ((TextStyle)var5.getTextFrame().getTextFrameFormat().getTextStyle()).k5((TextStyle)var1);
            }
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var3, IDisposable.class)) {
            var3.dispose();
         }
      }
   }

   final void t2() {
      this.l6.n5(this);
   }

   final long s7() {
      return this.c8;
   }

   final long x8() {
      synchronized (this) {
         return this.c8++;
      }
   }

   final void n5(long var1, boolean var3) {
      synchronized (this) {
         if (var3 && (var1 & 4294967295L) <= (this.c8 & 4294967295L)) {
            throw new Exception();
         }

         this.c8 = var1;
      }
   }

   final int n3() {
      synchronized (this) {
         return this.s7++;
      }
   }

   Shape[] n5(IPlaceholder var1) {
      return a6;
   }

   final ShapeFrame y4() {
      return new ShapeFrame(
         0.0F,
         0.0F,
         ((SlideSize)this.getPresentation().getSlideSize()).n5().l6(),
         ((SlideSize)this.getPresentation().getSlideSize()).n5().k5(),
         (byte)0,
         (byte)0,
         0.0F
      );
   }

   final MasterSlide e2() {
      Slide var1 = com.aspose.slides.internal.v6g.k5.n5(this, Slide.class);
      MasterSlide var2;
      if (var1 != null) {
         var2 = (MasterSlide)var1.r4();
      } else {
         LayoutSlide var3 = com.aspose.slides.internal.v6g.k5.n5(this, LayoutSlide.class);
         if (var3 != null) {
            var2 = (MasterSlide)var3.getMasterSlide();
         } else {
            var2 = com.aspose.slides.internal.v6g.k5.n5(this, MasterSlide.class);
         }
      }

      return var2;
   }

   static boolean n5(float var0) {
      return com.aspose.slides.ms.System.q1.n5(var0 - 1.0F) >= 1.0E-4F;
   }

   final void n5(float var1, float var2) {
      if (n5(var1) && n5(var2)) {
         float var3 = com.aspose.slides.ms.System.q1.l6(var1, var2);
         this.n5(var1, var2, var3);
      }
   }

   void n5(float var1, float var2, float var3) {
      if (n5(var1) || n5(var2)) {
         IGenericEnumerator var4 = this.getShapes().iterator();

         try {
            while (var4.hasNext()) {
               Shape var5 = (Shape)var4.next();
               var5.n5(var1, var2, var3);
            }
         } finally {
            if (com.aspose.slides.internal.v6g.k5.n5(var4, IDisposable.class)) {
               var4.dispose();
            }
         }
      }
   }

   void l6(float var1, float var2) {
      IGenericEnumerator var3 = this.getShapes().iterator();

      try {
         while (var3.hasNext()) {
            Shape var4 = (Shape)var3.next();
            var4.n5(var1, var2);
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var3, IDisposable.class)) {
            var3.dispose();
         }
      }
   }

   private String n5(String var1, boolean var2) {
      String var3 = var1;
      byte var4 = 74;
      var3 = com.aspose.slides.internal.r7c.c8.n5(var3, "(\\r\\n)|(\\n\\r)|(\\n)|(\\r)", "", var4);
      var3 = com.aspose.slides.internal.r7c.c8.n5(var3, ">\\s+<", "><", var4);
      if (var2) {
         String var14 = com.aspose.slides.internal.r7c.c8.n5(var3, " (r:)?id=\"\\{?(\\d|\\w|-)+\\}?\"", "", var4);
         String var15 = com.aspose.slides.internal.r7c.c8.n5(var14, " name=\"[^\"]*\"", "", var4);
         String var16 = com.aspose.slides.internal.r7c.c8.n5(var15, " panose=\"[^\"]*\"", "", var4);
         String var17 = com.aspose.slides.internal.r7c.c8.n5(var16, "<\\w:extLst>.*?</\\w:extLst>", "", var4);
         var3 = com.aspose.slides.internal.r7c.c8.n5(var17, "<\\w:extLst\\s*/>", "", var4);
         com.aspose.slides.internal.r7c.u9 var5 = com.aspose.slides.internal.r7c.c8.l6(var3, "<a:fld type=\"datetime[^\"]*\">.*?</a:fld>", var4);
         Iterator var6 = var5.iterator();

         try {
            while (var6.hasNext()) {
               com.aspose.slides.internal.r7c.u3 var7 = (com.aspose.slides.internal.r7c.u3)var6.next();
               String var8 = com.aspose.slides.internal.r7c.c8.n5(var7.k5(), "\">.*?</a:fld>", "></a:fld>", var4);
               var3 = com.aspose.slides.ms.System.d1.n5(var3, var7.k5(), var8);
            }
         } finally {
            if (com.aspose.slides.internal.v6g.k5.n5(var6, IDisposable.class)) {
               ((IDisposable)var6).dispose();
            }
         }
      }

      return var3;
   }

   @Override
   public final r0g getParent_Immediate() {
      return this.u9;
   }

   final void n5(r0g var1) {
      this.u9 = var1;
      this.h0 = null;
   }

   final IPresentationComponent t9() {
      if (this.h0 == null) {
         IPresentationComponent[] var1 = new IPresentationComponent[]{this.h0};
         d0u.n5(IPresentationComponent.class, this.u9, var1);
         this.h0 = var1[0];
      }

      return this.h0;
   }

   @Override
   public final IPresentation getPresentation() {
      return this.t9().getPresentation();
   }

   final Presentation z1() {
      return (Presentation)this.t9().getPresentation();
   }

   @Override
   public final IBaseSlide getSlide() {
      return this;
   }
}
