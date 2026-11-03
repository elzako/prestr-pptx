package com.aspose.slides;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.exceptions.ArgumentException;
import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.exceptions.InvalidOperationException;
import com.aspose.slides.exceptions.NullReferenceException;
import java.io.OutputStream;

public class Shape implements IShape, r0g {
   private r0g n5;
   private IPresentationComponent l6;
   private ISlideComponent k5;
   private ShapeCollection u3;
   private final u9i a6;
   private final b1b u9;
   private final IBaseShapeLock h0;
   private Placeholder e2;
   private final CustomData t9;
   private Hyperlink z1;
   private Hyperlink t4;
   private final HyperlinkManager q0;
   private boolean z3 = false;
   private byte m1 = -1;
   private ThreeDFormat k7;
   FillFormat c8;
   LineFormat t2;
   private EffectFormat m3;
   private o4f z8;
   private final m2h j5;
   private String w1 = "";
   private String r4 = "";
   private String c4 = "";
   private boolean y2 = false;
   long s7 = 0L;
   long x8 = 4294967295L;
   boolean n3 = false;
   private Shape$n5 y1;
   final com.aspose.slides.internal.v6g.n5<Shape$n5> y4 = new Shape$1(this);
   private Shape a0;
   private boolean d2;
   private g4a d5;
   private static final float[] s3 = new float[]{270.0F, 180.0F, 90.0F, 0.0F};
   private int p8 = -1;
   private boolean f2;

   final Shape w1() {
      return this.a0;
   }

   final void n5(Shape var1) {
      this.a0 = var1;
   }

   final ThreeDFormat r4() {
      if (this.k7 == null) {
         this.k7 = new ThreeDFormat(this);
      }

      return this.k7;
   }

   final LineFormat c4() {
      Shape var1 = this;
      this.x8().n5(this.t2, new Shape$2(this, var1));
      if (this.t2 == null) {
         this.t2 = new LineFormat(this);
      }

      return this.t2;
   }

   final LineFormat y2() {
      return this.l6(this);
   }

   final LineFormat l6(Shape var1) {
      if (this.t2 == null) {
         return null;
      }

      if (this.x8().n5(this.t2)) {
         this.t2.n5(var1);
      }

      return this.t2;
   }

   final EffectFormat y1() {
      if (this.m3 == null) {
         this.m3 = new EffectFormat(this);
      }

      return this.m3;
   }

   final void n5(EffectFormat var1) {
      this.m3 = var1;
   }

   final void n5(LineFormat var1) {
      this.t2 = var1;
   }

   final void a0() {
      LineFormat var1 = com.aspose.slides.internal.v6g.k5.n5(this.getLineFormat(), LineFormat.class);
      if (var1 != null) {
         var1.l6.n5(new Shape$3(this));
         var1.l6.l6(new Shape$4(this));
      }
   }

   private void n5() {
      SketchFormat var1 = com.aspose.slides.internal.v6g.k5.n5(this.getLineFormat().getSketchFormat(), SketchFormat.class);
      com.aspose.slides.internal.o9b.y1 var2 = ((ShapeFrame)this.getFrame()).n5().y4();
      j2x var3 = ((GeometryShape)this).e2();
      j2x var4 = var1.a6();
      j2x var5 = this.k5();
      if (var4.x8() == -1 && var1.getSketchType() != 0 && var5 == null) {
         var1.n5(j2x.n5(var3));
      }

      if (var1.getSketchType() != -1 && var1.getSketchType() != 0) {
         ShapeElement[] var6 = this.n5(var1, var5);
         if (this.getSlide() == null) {
            throw new PptxReadException("The slide cannot be null.");
         }

         com.aspose.slides.ms.System.i9 var7 = ((BaseSlide)this.getSlide()).a6();
         var3.n5(e9h.n5(var7, var2.y4(), var6, var1.getSketchType()));
         var3.n5(0);
      } else {
         this.n5(var4);
      }
   }

   private ShapeElement[] n5(SketchFormat var1, j2x var2) {
      ShapeElement[] var3 = null;
      j2x var4 = var1.a6();
      j2x var5 = ((GeometryShape)this).e2();
      if (var1.a6().x8() != -1) {
         var3 = var4.n5(this, this.getX(), this.getY(), this.getWidth(), this.getHeight());
      } else if (var2 != null) {
         var3 = var2.n5(this, this.getX(), this.getY(), this.getWidth(), this.getHeight());
      } else {
         var3 = var5.n5(this, this.getX(), this.getY(), this.getWidth(), this.getHeight());
      }

      return var3;
   }

   private j2x k5() {
      j2x var1 = null;
      Shape[] var2 = this.f2();

      for (int var3 = 0; var3 < var2.length; var3++) {
         GeometryShape var4 = com.aspose.slides.internal.v6g.k5.n5(var2[var3], GeometryShape.class);
         if (var4 != null && var4.e2().x8() != -1 && ((SketchFormat)var4.getLineFormat().getSketchFormat()).a6().x8() != -1) {
            var1 = ((SketchFormat)var4.getLineFormat().getSketchFormat()).a6();
            break;
         }
      }

      return var1;
   }

   private void n5(j2x var1) {
      if (var1.x8() != -1) {
         ((GeometryShape)this).u9().n5(j2x.n5(var1).n5());
         var1.n5(-1);
      } else {
         ((GeometryShape)this).e2().l6(-1);
      }
   }

   final boolean d2() {
      return this.d2;
   }

   final void k5(boolean var1) {
      this.d2 = var1;
   }

   final boolean d5() {
      return this.n3;
   }

   final void u3(boolean var1) {
      this.c8();
      this.n3 = var1;
   }

   @Override
   public final boolean isTextHolder() {
      return this.e2 != null;
   }

   @Override
   public final IPlaceholder getPlaceholder() {
      return this.e2;
   }

   final void n5(byte var1, byte var2, byte var3, long var4, boolean var6) {
      this.e2 = new Placeholder(var1, var2, var3, var4, var6);
      if (this.getSlide() != null) {
         ((BaseSlide)this.getSlide()).l6.l6(this);
      }
   }

   @Override
   public final void removePlaceholder() {
      if (this.e2 != null && this.getSlide() != null) {
         ((BaseSlide)this.getSlide()).l6.n5(this);
      }

      this.e2 = null;
   }

   @Override
   public final IPlaceholder addPlaceholder(IPlaceholder placeholderToCopyFrom) {
      if (this.isGrouped()) {
         throw new InvalidOperationException("Grouped shape cannot be a placeholder.");
      }

      if (this.e2 == null) {
         this.e2 = new Placeholder();
         if (this.getSlide() == null) {
            throw new PptxReadException("The slide cannot be null.");
         }

         ((BaseSlide)this.getSlide()).l6.l6(this);
      }

      this.e2.n5((Placeholder)placeholderToCopyFrom);
      return this.e2;
   }

   @Override
   public final IShape getBasePlaceholder() {
      BaseSlide var1 = this.j9();
      if (var1 == null || this.e2 == null) {
         return null;
      }

      if (com.aspose.slides.internal.v6g.k5.l6(var1, Slide.class)) {
         Slide var7 = (Slide)var1;
         LayoutSlide var8 = var7.w1();
         if (var8 == null) {
            return null;
         }

         MasterSlide var4 = (MasterSlide)var8.getMasterSlide();
         Shape var5 = null;
         if (this.e2.getIndex() == 4294967295L) {
            if (this.e2.getType() == 8) {
               var5 = var8.l6.l6(this.e2);
               if (var5 != null && this.e2.getSize() == var5.getPlaceholder().getSize() && this.e2.getIndex() == var5.getPlaceholder().getIndex()) {
                  return var5;
               }
            } else if (this.e2.getType() != 1 && this.e2.getType() != 2) {
               var5 = var8.l6.l6(this.e2);
               if (var5 != null) {
                  return var5;
               }
            }

            Shape var6 = null;
            if (var4 != null) {
               var6 = var4.l6.n5(this.e2, null);
            }

            return var6;
         } else {
            return var8.l6.n5(this.e2);
         }
      } else if (com.aspose.slides.internal.v6g.k5.l6(var1, LayoutSlide.class)) {
         LayoutSlide var2 = (LayoutSlide)var1;
         MasterSlide var3 = (MasterSlide)var2.getMasterSlide();
         return var3 == null ? null : var3.l6.n5(this.e2, null);
      } else if (!com.aspose.slides.internal.v6g.k5.l6(var1, NotesSlide.class)) {
         return null;
      } else {
         return this.getPresentation() != null && this.getPresentation().getMasterNotesSlideManager().getMasterNotesSlide() != null
            ? ((BaseSlide)this.getPresentation().getMasterNotesSlideManager().getMasterNotesSlide()).l6.n5(this.e2, null)
            : null;
      }
   }

   @Override
   public final ICustomData getCustomData() {
      return this.t9;
   }

   @Override
   public final IShapeFrame getRawFrame() {
      this.e5().k5();
      o4f var1 = this.R_();
      e4c var2 = var1.n5().u9();
      e4c var3 = this.z7().u9();
      return new ShapeFrame(var2.n5, var2.l6, var3.n5, var3.l6, var1.u3(), var1.a6(), var1.k5());
   }

   @Override
   public final void setRawFrame(IShapeFrame value) {
      x4t var2 = new x4t();
      var2.l6 = value.getRotation();
      var2.u3 = value.getFlipH() == 1;
      var2.k5 = value.getFlipV() == 1;
      l3f var3 = new l3f();
      var3.n5 = new d2k(value.getX(), value.getY());
      var3.l6 = new d2k(value.getWidth(), value.getHeight());
      var3.k5 = var2;
      this.n5(var3.l6());
      this.h2();
   }

   o4f R_() {
      return this.s3();
   }

   final void n5(l3f var1) {
      this.n5(var1.n5.l6().u9(), var1.l6.l6().u9(), var1.k5.n5());
   }

   void n5(e4c var1, e4c var2, x4t var3) {
      o4f var4 = this.s3();
      var4.n5(var1.u9());
      this.k5(var2.u9());
      var4.n5(var3.n5());
   }

   final void n5(double var1, double var3) {
      this.k5(new e4c(var1, var3));
   }

   void k5(e4c var1) {
      this.s3().l6(var1.u9());
   }

   final o4f s3() {
      if (this.z8 == null) {
         this.z8 = new o4f();
      }

      return this.z8;
   }

   final void n5(o4f var1) {
      this.z8 = var1;
   }

   @Override
   public final IShapeFrame getFrame() {
      this.e5().k5();
      return this.p8();
   }

   @Override
   public final void setFrame(IShapeFrame value) {
      if (!com.aspose.slides.ms.System.n1.k5(value.getX())
         && !com.aspose.slides.ms.System.n1.k5(value.getY())
         && !com.aspose.slides.ms.System.n1.k5(value.getWidth())
         && !com.aspose.slides.ms.System.n1.k5(value.getHeight())
         && value.getFlipH() != -1
         && value.getFlipV() != -1
         && !com.aspose.slides.ms.System.n1.k5(value.getRotation())) {
         this.n5((ShapeFrame)value);
         this.h2();
      } else {
         throw new ArgumentException(
            com.aspose.slides.ms.System.d1.n5(new String[]{
               "Value of each property of the assigned IShapeFrame instance must ", "be not undefined (must be not NaN or NotDefined)."
            })
         );
      }
   }

   final ShapeFrame p8() {
      return this.e5().n3();
   }

   final void n5(ShapeFrame var1) {
      this.l6(var1);
   }

   final Shape[] f2() {
      BaseSlide var1 = this.j9();
      return var1 != null && this.e2 != null ? var1.n5(this.e2) : BaseSlide.a6;
   }

   final ShapeFrame i1() {
      this.e5().k5();
      l3f var1 = this.e5().t9().l6();
      this.e5().n5(var1.l6()).n5(var1);
      return new ShapeFrame(var1.n5.n5, var1.n5.l6, var1.l6.n5, var1.l6.l6, (byte)(var1.k5.u3 ? 1 : 0), (byte)(var1.k5.k5 ? 1 : 0), var1.k5.l6);
   }

   final void l6(ShapeFrame var1) {
      this.n5(this.k5(var1).l6());
      this.u9();
   }

   final void l6(l3f var1) {
      this.n5(this.k5(var1.l6()).l6());
      this.u9();
   }

   private void u9() {
      List var1 = new List();

      for (GroupShape var2 = this.f0(); var2.x9() != null; var2 = var2.f0()) {
         var1.addItem(var2);
      }

      for (int var3 = 0; var3 < var1.size(); var3++) {
         ((GroupShape)var1.get_Item(var3)).z1();
      }
   }

   final l3f k5(l3f var1) {
      float var2 = var1.k5.l6;
      boolean var3 = false;
      boolean var4 = false;
      boolean var5 = false;
      e4c var6 = e4c.u3.u9();
      e4c var7 = var1.l6.l6().u9();
      e4c var8 = d2k.n5(var1.n5, d2k.n5(var1.l6, 2)).l6().u9();
      GroupShape var9 = this.f0();
      List var10 = new List();

      while (var9.x9() != null) {
         var10.addItem(var9);
         var9 = var9.f0();
      }

      for (int var11 = var10.size() - 1; var11 >= 0; var11--) {
         var9 = (GroupShape)var10.get_Item(var11);
         o4f var12 = var9.R_();
         var2 -= var12.k5();
         if (var12.u3() == 1 ^ var12.a6() == 1) {
            var2 = -var2;
         }

         var3 ^= var9.b3();
         if (var9.b3()) {
            var6.k5();
            boolean var13 = var4;
            var4 = var5;
            var5 = var13;
         }

         var4 ^= var12.u3() == 1;
         var5 ^= var12.a6() == 1;
         e4c var33 = var9.x8().u9();
         var6.n5 = var6.n5 * var33.n5;
         var6.l6 = var6.l6 * var33.l6;
         double var14 = -var12.k5() / 180.0F * Math.PI;
         double var16 = com.aspose.slides.ms.System.q1.c8(var14);
         double var18 = com.aspose.slides.ms.System.q1.h0(var14);
         e4c var20 = e4c.l6(e4c.l6(var8, var12.n5()), e4c.n5(var9.z7(), 2)).u9();
         e4c var21 = e4c.n5(var9.k5(), e4c.n5(var9.u9(), 2)).u9();
         if (var11 > 0) {
            GroupShape var22 = (GroupShape)var10.get_Item(var11 - 1);
            o4f var23 = var22.R_();
            e4c var24 = e4c.n5(var23.n5(), e4c.n5(var22.z7(), 2)).u9();
            var8.n5 = (var20.n5 * var16 - var20.l6 * var18) * (var12.u3() == 1 ? -1 : 1) - (var24.n5 - var21.n5) * var6.n5;
            var8.l6 = (var20.n5 * var18 + var20.l6 * var16) * (var12.a6() == 1 ? -1 : 1) - (var24.l6 - var21.l6) * var6.l6;
            e4c.n5(var8, var24).l6(var8);
         } else {
            var8.n5 = (var20.n5 * var16 - var20.l6 * var18) * (var12.u3() == 1 ? -1 : 1) / var6.n5 + var21.n5;
            var8.l6 = (var20.n5 * var18 + var20.l6 * var16) * (var12.a6() == 1 ? -1 : 1) / var6.l6 + var21.l6;
         }
      }

      var2 = ShapeFrame.n5(var2);
      var3 = var2 > 45.0F && var2 < 135.0F || var2 > 225.0F && var2 < 315.0F;
      if (!var3) {
         var7.n5 = var7.n5 / var6.n5;
         var7.l6 = var7.l6 / var6.l6;
      } else {
         var7.n5 = var7.n5 / var6.l6;
         var7.l6 = var7.l6 / var6.n5;
         boolean var30 = var4;
         var4 = var5;
         var5 = var30;
      }

      var4 ^= var1.k5.u3;
      var5 ^= var1.k5.k5;
      x4t var31 = new x4t();
      var31.l6 = var2;
      var31.u3 = var4;
      var31.k5 = var5;
      l3f var32 = new l3f();
      e4c.l6(var8, e4c.n5(var7, 2)).a6().n5(var32.n5);
      var7.a6().n5(var32.l6);
      var32.k5 = var31;
      return var32;
   }

   final l3f k5(ShapeFrame var1) {
      x4t var2 = new x4t();
      var2.l6 = var1.getRotation();
      var2.u3 = var1.getFlipH() == 1;
      var2.k5 = var1.getFlipV() == 1;
      l3f var3 = new l3f();
      var3.n5 = new d2k(var1.getX(), var1.getY());
      var3.l6 = new d2k(var1.getWidth(), var1.getHeight());
      var3.k5 = var2;
      return this.k5(var3.l6());
   }

   @Override
   public ILineFormat getLineFormat() {
      return this.c4();
   }

   @Override
   public IThreeDFormat getThreeDFormat() {
      return this.r4();
   }

   @Override
   public IEffectFormat getEffectFormat() {
      return this.y1();
   }

   @Override
   public IFillFormat getFillFormat() {
      return this.c8;
   }

   ILineFormatEffectiveData q0() {
      return null;
   }

   IFillFormatEffectiveData z3() {
      return null;
   }

   @Override
   public final IImage getImage() {
      return this.getImage(1, 1.0F, 1.0F);
   }

   @Override
   public final IImage getImage(int bounds, float scaleX, float scaleY) {
      return u4i.n5(this.n5(bounds, scaleX, scaleY));
   }

   final com.aspose.slides.internal.o9b.l6 n5(int var1, float var2, float var3) {
      return this.e5().n5(var1, var2, var3);
   }

   @Override
   public final void writeAsSvg(OutputStream stream) {
      com.aspose.slides.internal.l6o.l6.n5(new Shape$5(this, stream));
   }

   void l6(com.aspose.slides.internal.z0k.t4 var1) {
      this.n5(var1, null);
   }

   @Override
   public final void writeAsSvg(OutputStream stream, ISVGOptions svgOptions) {
      com.aspose.slides.internal.l6o.l6.n5(new Shape$6(this, stream, svgOptions));
   }

   void n5(com.aspose.slides.internal.z0k.t4 var1, ISVGOptions var2) {
      this.e5().n5(var1, var2);
   }

   @Override
   public final IHyperlink getHyperlinkClick() {
      return this.z1;
   }

   @Override
   public final void setHyperlinkClick(IHyperlink value) {
      this.z1 = (Hyperlink)value;
      if (value != null) {
         this.z1.n5(this);
      }
   }

   @Override
   public final IHyperlink getHyperlinkMouseOver() {
      return this.t4;
   }

   @Override
   public final void setHyperlinkMouseOver(IHyperlink value) {
      this.t4 = (Hyperlink)value;
      if (value != null) {
         this.t4.n5(this);
      }
   }

   @Override
   public final IHyperlinkManager getHyperlinkManager() {
      return this.q0;
   }

   Shape(r0g parentImmediate) {
      this(parentImmediate, new u9i(), new b1b(), new BaseShapeLock());
      this.n5((g4a)null);
   }

   Shape(r0g parentImmediate, u9i pptxUnsupportedProps, IBaseShapeLock shapeLock) {
      this(parentImmediate, pptxUnsupportedProps, new b1b(), shapeLock);
   }

   Shape(r0g parentImmediate, u9i pptxUnsupportedProps, b1b pptUnsupportedProps, IBaseShapeLock shapeLock) {
      this.h0 = shapeLock;
      this.n5((Shape)null);
      this.c8 = new FillFormat(this);
      this.t9 = new CustomData(this);
      this.q0 = new HyperlinkManager(this);
      this.l6(parentImmediate);
      this.a6 = pptxUnsupportedProps;
      this.u9 = pptUnsupportedProps;
      this.j5 = i7q.n5(this.a3());
      this.k7 = null;
      this.m3 = null;
      this.z8 = null;
      this.k5(false);
   }

   final void n5(g4a var1) {
      if (var1 == null) {
         var1 = new g4a(this);
      }

      this.l6(var1);
   }

   final g4a e5() {
      return this.d5;
   }

   private void l6(g4a var1) {
      this.d5 = var1;
   }

   u9i h0() {
      return this.a6;
   }

   b1b k7() {
      return this.u9;
   }

   @Override
   public final boolean getHidden() {
      return this.z3;
   }

   @Override
   public final void setHidden(boolean value) {
      this.z3 = value;
   }

   com.aspose.slides.internal.o9b.w1[] P_() {
      return this.e5().z1();
   }

   float[] Q_() {
      return s3;
   }

   @Override
   public int getZOrderPosition() {
      int var1 = 0;
      if (this.x9() != null) {
         var1 = this.x9().indexOf(this);
      }

      return var1;
   }

   @Override
   public final int getConnectionSiteCount() {
      return this.e5().t2().length;
   }

   @Override
   public final float getRotation() {
      return this.p8().getRotation();
   }

   @Override
   public final void setRotation(float value) {
      IShapeFrame var2 = this.getFrame();
      value = ShapeFrame.n5(value);
      if (com.aspose.slides.ms.System.q1.n5(var2.getRotation() - value) > 1.0E-4) {
         this.setFrame(new ShapeFrame(var2.getX(), var2.getY(), var2.getWidth(), var2.getHeight(), var2.getFlipH(), var2.getFlipV(), value));
         this.h2();
      }
   }

   final boolean b3() {
      float var1 = ShapeFrame.n5(this.s3().k5());
      boolean var2 = this.s3().a6() == 1;
      boolean var3 = this.s3().u3() == 1;
      return var2 ^ var3
         ? var1 > 45.0F && var1 <= 135.0F || var1 > 225.0F && var1 <= 315.0F
         : var1 >= 45.0F && var1 < 135.0F || var1 >= 225.0F && var1 < 315.0F;
   }

   final com.aspose.slides.internal.o9b.y1 o0() {
      ShapeFrame var1 = this.e5().e2();
      if (this.b3()) {
         float var2 = var1.getX() + var1.getWidth() / 2.0F;
         float var3 = var1.getY() + var1.getHeight() / 2.0F;
         return new com.aspose.slides.internal.o9b.y1(var2 - var1.getHeight() / 2.0F, var3 - var1.getWidth() / 2.0F, var1.getHeight(), var1.getWidth());
      } else {
         return var1.n5();
      }
   }

   @Override
   public final float getX() {
      return this.getFrame().getX();
   }

   @Override
   public final void setX(float value) {
      IShapeFrame var2 = this.getFrame();
      if (com.aspose.slides.ms.System.q1.n5(var2.getX() - value) > 1.0E-4) {
         this.setFrame(new ShapeFrame(value, var2.getY(), var2.getWidth(), var2.getHeight(), var2.getFlipH(), var2.getFlipV(), var2.getRotation()));
         this.h2();
      }
   }

   @Override
   public final float getY() {
      return this.getFrame().getY();
   }

   @Override
   public final void setY(float value) {
      IShapeFrame var2 = this.getFrame();
      if (com.aspose.slides.ms.System.q1.n5(var2.getY() - value) > 1.0E-4) {
         this.setFrame(new ShapeFrame(var2.getX(), value, var2.getWidth(), var2.getHeight(), var2.getFlipH(), var2.getFlipV(), var2.getRotation()));
         this.h2();
      }
   }

   final boolean n5(d2k var1) {
      IShapeFrame var2 = this.getFrame();
      if (var2.getX() == var1.n5 && var2.getY() == var1.l6) {
         return false;
      }

      this.setFrame(new ShapeFrame(var1.n5, var1.l6, var2.getWidth(), var2.getHeight(), var2.getFlipH(), var2.getFlipV(), var2.getRotation()));
      this.h2();
      return true;
   }

   @Override
   public final float getWidth() {
      return this.getFrame().getWidth();
   }

   @Override
   public final void setWidth(float value) {
      if (com.aspose.slides.ms.System.q1.n5(this.getWidth() - value) > 1.0E-4) {
         this.l6(value);
      }
   }

   @Override
   public final float getHeight() {
      return this.getFrame().getHeight();
   }

   @Override
   public final void setHeight(float value) {
      if (com.aspose.slides.ms.System.q1.n5(this.getHeight() - value) > 1.0E-4) {
         this.k5(value);
      }
   }

   void k5(float var1) {
      ShapeFrame var2 = this.p8();
      this.l6(new d2k(var2.getWidth(), var1));
   }

   void l6(float var1) {
      ShapeFrame var2 = this.p8();
      this.l6(new d2k(var1, var2.getHeight()));
   }

   final void l6(d2k var1) {
      ShapeFrame var2 = this.p8();
      this.setFrame(new ShapeFrame(var2.getX(), var2.getY(), var1.n5, var1.l6, var2.getFlipH(), var2.getFlipV(), var2.getRotation()));
      this.h2();
   }

   final e4c z7() {
      return this.R_().l6();
   }

   @Override
   public final byte getBlackWhiteMode() {
      return this.m1;
   }

   @Override
   public final void setBlackWhiteMode(byte value) {
      this.m1 = value;
   }

   final long v4() {
      return this.h0().z3();
   }

   final void u3(String var1) {
      if (this.getPresentation() == null) {
         throw new NullReferenceException("Presentation couldn't be empty.");
      }

      int[] var2 = new int[]{this.p8};
      boolean var3 = !com.aspose.slides.ms.System.a3.n5(var1, var2) || var2[0] < 0;
      this.p8 = var2[0];
      if (var3) {
         this.p8 = (int)((Presentation)this.getPresentation()).u3();
      } else {
         this.p8 = (int)((Presentation)this.getPresentation()).n5(this.p8 & 4294967295L);
      }
   }

   @Override
   public final long getUniqueId() {
      if (this.p8 == -1) {
         if (this.getPresentation() == null) {
            throw new NullReferenceException("Presentation couldn't be empty.");
         }

         this.p8 = (int)((Presentation)this.getPresentation()).u3();
      }

      return this.p8 & 4294967295L;
   }

   @Override
   public final long getOfficeInteropShapeId() {
      return this.h0().z3();
   }

   final void k5(long var1) {
      if ((this.h0().z3() & 4294967295L) != 0L) {
         throw new InvalidOperationException("ShapeId had been initialized already.");
      }

      this.u3(var1);
   }

   final void u3(long var1) {
      BaseSlide var3 = this.j9();
      if ((this.h0().z3() & 4294967295L) != 0L) {
      }

      if (var3 == null) {
         throw new NullReferenceException("Slide couldn't be empty.");
      }

      if ((var3.s7() & 4294967295L) <= (var1 & 4294967295L)) {
         var3.n5((var1 & 4294967295L) + 1L & 4294967295L, true);
      }

      this.h0().n5(var1);
   }

   final long u6() {
      if ((this.h0().z3() & 4294967295L) != 0L) {
         throw new InvalidOperationException("ShapeId had been created already.");
      }

      if (this.j9() == null) {
         throw new NullReferenceException("Slide couldn't be empty.");
      }

      long var1 = this.j9().x8();
      this.k5(var1);
      return var1;
   }

   void n5(float var1, float var2, float var3) {
      Shape[] var4 = this.f2();
      if (var4.length == 0
         || this.getX() != var4[0].getX()
         || this.getY() != var4[0].getY()
         || this.getWidth() != var4[0].getWidth()
         || this.getHeight() != var4[0].getHeight()) {
         this.l6(var1, var2, var3);
      }
   }

   void n5(float var1, float var2) {
      Shape[] var3 = this.f2();
      if (var3.length == 0
         || this.getX() != var3[0].getX()
         || this.getY() != var3[0].getY()
         || this.getWidth() != var3[0].getWidth()
         || this.getHeight() != var3[0].getHeight()) {
         this.u3(true);
         if (!com.aspose.slides.internal.v6g.k5.l6(this.getSlide(), MasterSlide.class)
            && !com.aspose.slides.internal.v6g.k5.l6(this.getSlide(), LayoutSlide.class)) {
            if (this.getSlide() == null) {
               throw new NullReferenceException("Slide couldn't be empty.");
            }

            com.aspose.slides.internal.o9b.f2 var4 = ((SlideSize)this.getSlide().getPresentation().getSlideSize()).n5().a6();
            this.setX(this.getX() + (var4.l6() - var4.l6() / var1) / 2.0F);
            this.setY(this.getY() + (var4.k5() - var4.k5() / var2) / 2.0F);
         } else {
            this.setX(this.getX() * var1);
            this.setWidth(this.getWidth() * var1);
            this.setY(this.getY() * var2);
            this.setHeight(this.getHeight() * var2);
         }

         this.u3(false);
      }
   }

   void s7() {
      if (!com.aspose.slides.internal.v6g.k5.l6(this.j9(), Slide.class)) {
         throw new InvalidOperationException("Reset method is appliable only for Slide's shapes.");
      }

      this.c8.u9();
      if (this.t2 != null) {
         this.t2.u9();
      }

      if (this.m3 != null) {
         this.m3.u9();
      }

      if (this.k7 != null) {
         this.k7.s7();
      }

      this.v0();
   }

   final void l6(float var1, float var2, float var3) {
      this.u3(true);
      if (!com.aspose.slides.internal.v6g.k5.l6(this.getSlide(), MasterSlide.class)
         && !com.aspose.slides.internal.v6g.k5.l6(this.getSlide(), LayoutSlide.class)) {
         if (this.getSlide() == null) {
            throw new NullReferenceException("Slide couldn't be empty.");
         }

         com.aspose.slides.internal.o9b.f2 var4 = ((SlideSize)this.getSlide().getPresentation().getSlideSize()).n5().a6();
         this.setX((var4.l6() / var1 / 2.0F - this.getX()) * (var1 - var3) + this.getX() * var1);
         this.setWidth(this.getWidth() * var3);
         this.setY((var4.k5() / var2 / 2.0F - this.getY()) * (var2 - var3) + this.getY() * var2);
         this.setHeight(this.getHeight() * var3);
      } else {
         this.setX(this.getX() * var1);
         this.setWidth(this.getWidth() * var1);
         this.setY(this.getY() * var2);
         this.setHeight(this.getHeight() * var2);
      }

      this.u3(false);
   }

   @Override
   public final String getAlternativeText() {
      return this.r4;
   }

   @Override
   public final void setAlternativeText(String value) {
      this.r4 = value;
   }

   @Override
   public final String getAlternativeTextTitle() {
      return this.c4;
   }

   @Override
   public final void setAlternativeTextTitle(String value) {
      this.c4 = value;
   }

   @Override
   public final String getName() {
      return this.w1;
   }

   @Override
   public final void setName(String value) {
      if (value == null) {
         throw new ArgumentNullException("Must be not null. Use empty string value.");
      }

      this.w1 = value;
   }

   @Override
   public final boolean isDecorative() {
      return this.y2;
   }

   @Override
   public final void setDecorative(boolean value) {
      this.y2 = value;
   }

   final boolean t1() {
      return this.f2;
   }

   final void a6(boolean var1) {
      this.f2 = var1;
   }

   final boolean a5() {
      return this.y2 || this.t1();
   }

   @Override
   public IBaseShapeLock getShapeLock() {
      return this.h0;
   }

   void c8() {
   }

   final void h2() {
      this.s7++;
   }

   void S_() {
      if (this.y1 != null) {
         this.y1.n5(this);
      }

      this.removePlaceholder();
      this.l6((r0g)null);
   }

   long t2() {
      return this.s7;
   }

   final void v0() {
      o4f var1 = this.s3();
      var1.n5(new e4c(Double.NaN, Double.NaN));
      this.n5(Double.NaN, Double.NaN);
      var1.n5(Float.NaN, (byte)-1, (byte)-1);
      if (com.aspose.slides.internal.v6g.k5.l6(this, GroupShape.class)) {
         com.aspose.slides.internal.v6g.k5.n5(this, GroupShape.class).n5(e4c.k5.u9());
         com.aspose.slides.internal.v6g.k5.n5(this, GroupShape.class).l6(e4c.k5.u9());
      }

      this.h2();
   }

   @Override
   public final boolean isGrouped() {
      return this.x9() != null && this.x9().m1().x9() != null;
   }

   @Override
   public final IGroupShape getParentGroup() {
      return this.f0();
   }

   final GroupShape f0() {
      GroupShape var1 = null;
      if (this.x9() != null) {
         var1 = this.x9().m1();
      } else {
         GroupShape[] var2 = new GroupShape[]{var1};
         d0u.n5(GroupShape.class, this.n5, var2);
         var1 = var2[0];
      }

      return var1;
   }

   boolean n3() {
      if (!this.getEffectFormat().isNoEffects()) {
         return true;
      } else if (((FillFormat)this.getFillFormat()).u3()) {
         return true;
      } else if (((LineFillFormat)this.getLineFormat().getFillFormat()).a6()) {
         return true;
      } else {
         return this.p3().getSlide().getTimeline().getMainSequence().getCount(this) > 0
            ? true
            : !com.aspose.slides.ms.System.d1.n5(this.getAlternativeText()) || !com.aspose.slides.ms.System.d1.n5(this.getAlternativeTextTitle());
      }
   }

   @Override
   public final r0g getParent_Immediate() {
      return this.n5;
   }

   final void l6(r0g var1) {
      this.n5 = var1;
      this.l6 = null;
      this.k5 = null;
      this.u3 = com.aspose.slides.internal.v6g.k5.n5(var1, ShapeCollection.class);
   }

   final IPresentationComponent a3() {
      if (this.l6 == null) {
         IPresentationComponent[] var1 = new IPresentationComponent[]{this.l6};
         ISlideComponent[] var2 = new ISlideComponent[]{this.k5};
         d0u.n5(this.n5, var1, var2);
         this.l6 = var1[0];
         this.k5 = var2[0];
      }

      return this.l6;
   }

   final ISlideComponent p3() {
      if (this.k5 == null) {
         IPresentationComponent[] var1 = new IPresentationComponent[]{this.l6};
         ISlideComponent[] var2 = new ISlideComponent[]{this.k5};
         d0u.n5(this.n5, var1, var2);
         this.l6 = var1[0];
         this.k5 = var2[0];
      }

      return this.k5;
   }

   final ShapeCollection x9() {
      return this.u3;
   }

   private z1f<ILineFormat, LineFormat> x8() {
      return this.j5.n5();
   }

   public final java.awt.geom.Rectangle2D.Float getVisualBounds() {
      return com.aspose.slides.internal.o9b.y1.u9(this.y0());
   }

   com.aspose.slides.internal.o9b.y1 y0() {
      return this.e5().t4();
   }

   @Override
   public final IBaseSlide getSlide() {
      return this.j9();
   }

   final BaseSlide j9() {
      ISlideComponent var1 = this.p3();
      return var1 != null ? (BaseSlide)this.p3().getSlide() : null;
   }

   @Override
   public final IPresentation getPresentation() {
      return this.a3() != null ? this.a3().getPresentation() : null;
   }

   // $VF: synthetic method
   static Shape$n5 n5(Shape var0, Shape$n5 var1) {
      return var0.y1 = var1;
   }

   // $VF: synthetic method
   static void k5(Shape var0) {
      var0.n5();
   }
}
