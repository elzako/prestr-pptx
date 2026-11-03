package com.aspose.slides;

import com.aspose.slides.exceptions.InvalidOperationException;
import java.awt.Color;

final class f6a extends x8<FillFormat, f6a> implements IFillFormatEffectiveData {
   byte k5;
   byte u3;
   private boolean h0;
   j3z a6;
   private j0p c8;
   private g3a t2;
   private f3f s7;
   private f6a x8;
   static final f6a u9 = y4();

   f6a(FillFormat var1) {
      super(var1);
      this.t4();
   }

   f6a(q6z var1) {
      super(var1);
      this.t4();
   }

   private void t4() {
      this.k5 = -1;
      this.u3 = -1;
      this.h0 = false;
   }

   final void u9() {
      this.k5 = -1;
      this.u3 = -1;
      if (this.a6 != null) {
         this.a6.u3();
      }

      if (this.c8 != null) {
         this.c8.n5();
      }

      if (this.t2 != null) {
         this.t2.n5();
      }

      if (this.s7 != null) {
         this.s7.n5();
      }

      this.h0 = false;
   }

   @Override
   public final byte getFillType() {
      return this.k5;
   }

   @Override
   public final Color getSolidFillColor() {
      return com.aspose.slides.internal.o9b.c8.l6(this.h0());
   }

   com.aspose.slides.internal.o9b.c8 h0() {
      if (this.getFillType() == 1) {
         return this.a6.n5();
      } else {
         throw new InvalidOperationException(
            com.aspose.slides.ms.System.d1.n5(new String[]{
               "SolidFillColor is unavailable for FillType=", com.aspose.slides.ms.System.s3.n5(FillType.class, this.getFillType())
            })
         );
      }
   }

   @Override
   public final int getSolidFillSchemeColor() {
      if (this.getFillType() == 1) {
         return this.a6.l6();
      } else {
         throw new InvalidOperationException(
            com.aspose.slides.ms.System.d1.n5(new String[]{"SchemeColor is unavailable for FillType=", com.aspose.slides.ms.System.s3.n5(FillType.class, this.getFillType())})
         );
      }
   }

   @Override
   public final IGradientFormatEffectiveData getGradientFormat() {
      if (this.getFillType() == 2) {
         return this.c8;
      } else {
         throw new InvalidOperationException(
            com.aspose.slides.ms.System.d1.n5(new String[]{
               "GradientFormat is unavailable for FillType=", com.aspose.slides.ms.System.s3.n5(FillType.class, this.getFillType())
            })
         );
      }
   }

   @Override
   public final IPatternFormatEffectiveData getPatternFormat() {
      if (this.getFillType() == 3) {
         return this.t2;
      } else {
         throw new InvalidOperationException(
            com.aspose.slides.ms.System.d1.n5(new String[]{
               "PatternFormat is unavailable for FillType=", com.aspose.slides.ms.System.s3.n5(FillType.class, this.getFillType())
            })
         );
      }
   }

   @Override
   public final IPictureFillFormatEffectiveData getPictureFillFormat() {
      if (this.getFillType() == 4) {
         return this.s7;
      } else {
         throw new InvalidOperationException(
            com.aspose.slides.ms.System.d1.n5(new String[]{
               "PictureFillFormat is unavailable for FillType=", com.aspose.slides.ms.System.s3.n5(FillType.class, this.getFillType())
            })
         );
      }
   }

   @Override
   public final boolean getRotateWithShape() {
      return this.u3 == 1;
   }

   final boolean c8() {
      return this.h0;
   }

   final j3z t2() {
      if (this.a6 == null) {
         this.a6 = new j3z();
      }

      return this.a6;
   }

   final j0p s7() {
      if (this.c8 == null) {
         this.c8 = new j0p();
      }

      return this.c8;
   }

   final g3a x8() {
      if (this.t2 == null) {
         this.t2 = new g3a();
      }

      return this.t2;
   }

   final f3f n3() {
      if (this.s7 == null) {
         this.s7 = new f3f(this);
      }

      return this.s7;
   }

   final void n5(FillFormat var1) {
      if (var1.getFillType() == 1) {
         this.t2().n5((ColorFormat)var1.getSolidFillColor());
      }
   }

   static f6a y4() {
      f6a var0 = new f6a((FillFormat)null);
      var0.k5 = 0;
      var0.u3 = 1;
      var0.t2().n5(com.aspose.slides.internal.o9b.c8.m3().o8());
      var0.x8().l6.n5(com.aspose.slides.internal.o9b.c8.m3().o8());
      var0.x8().k5.n5(com.aspose.slides.internal.o9b.c8.w4().o8());
      var0.s7().a6 = 0;
      f3f var1 = var0.n3();
      return var0;
   }

   static f6a e2() {
      f6a var0 = new f6a((FillFormat)null);
      var0.k5 = 1;
      var0.u3 = 0;
      var0.t2().n5(com.aspose.slides.internal.o9b.c8.m3().o8());
      var0.x8().l6.n5(com.aspose.slides.internal.o9b.c8.m3().o8());
      var0.x8().k5.n5(com.aspose.slides.internal.o9b.c8.w4().o8());
      var0.s7().a6 = 0;
      f3f var1 = var0.n3();
      return var0;
   }

   static f6a t9() {
      f6a var0 = new f6a((FillFormat)null);
      var0.k5 = 1;
      var0.u3 = 0;
      var0.t2().n5(com.aspose.slides.internal.o9b.c8.u3.o8());
      var0.x8().l6.n5(com.aspose.slides.internal.o9b.c8.m3().o8());
      var0.x8().k5.n5(com.aspose.slides.internal.o9b.c8.w4().o8());
      var0.s7().a6 = 0;
      f3f var1 = var0.n3();
      return var0;
   }

   static f6a z1() {
      f6a var0 = new f6a((FillFormat)null);
      var0.k5 = 1;
      var0.u3 = 0;
      var0.t2().n5(com.aspose.slides.internal.o9b.c8.u3.o8());
      var0.s7().a6 = 0;
      f3f var1 = var0.n3();
      return var0;
   }

   static f6a l6(FillFormat var0) {
      IPresentationComponent var1 = var0.getParent_IPresentationComponent();
      if (com.aspose.slides.internal.v6g.k5.l6(var1, Shape.class)) {
         Shape var7 = (Shape)var1;
         if (com.aspose.slides.internal.v6g.k5.l6(var7, GeometryShape.class) && ((GeometryShape)var7).getShapeStyle() != null) {
            IShapeStyle var8 = ((GeometryShape)var7).getShapeStyle();
            s8u var4 = (s8u)n5((q1v)var0).createThemeEffective();
            if (var4 != null) {
               f6a var5 = var4.n5(var8.getFillStyleIndex());
               return var5 != null ? var5 : u9;
            } else {
               return u9;
            }
         } else {
            Shape var3 = (Shape)var7.getBasePlaceholder();
            return var3 != null ? ((FillFormat)var3.getFillFormat()).c8() : u9;
         }
      } else if (com.aspose.slides.internal.v6g.k5.l6(var1, FormatScheme.class) || com.aspose.slides.internal.v6g.k5.l6(var1, Background.class)) {
         return u9;
      } else if (com.aspose.slides.internal.v6g.k5.l6(var1, Cell.class)) {
         Cell var6 = (Cell)var1;
         return var6.n3().n5() != null ? var6.x8().u9().u9() : var6.k5().y4().l6().u9();
      } else if (com.aspose.slides.internal.v6g.k5.l6(var1, z2x.class)) {
         return u9;
      } else if (com.aspose.slides.internal.v6g.k5.l6(var1, Portion.class)) {
         Portion var2 = (Portion)var1;
         return var2.n3() != null ? (f6a)var2.n3().getParagraphFormat().getEffective().getDefaultPortionFormat().getFillFormat() : u9;
      } else {
         return u9;
      }
   }

   private f6a q0() {
      Shape var1 = com.aspose.slides.internal.v6g.k5.n5(this.W_().getParent_IPresentationComponent(), Shape.class);
      if (var1 != null && this.getFillType() == 5) {
         f6a var2 = var1.f0() != null ? ((FillFormat)var1.f0().getFillFormat()).c8() : u9;
         this.h0 = true;
         return var2;
      } else {
         return null;
      }
   }

   @Override
   boolean n5(boolean var1) {
      boolean var2 = false;
      f6a var3 = this.q0();
      if (var3 != null && (var1 || this.x8 == null || (var3.k5() & 4294967295L) != (this.x8.k5() & 4294967295L))) {
         this.n5((i7b)var3);
         var2 = true;
      }

      this.x8 = var3;
      return var2;
   }

   final void n5(i7b var1) {
      f6a var2 = (f6a)var1;
      this.n5(var2);
      this.l6(var2);
   }

   final void n5(f6a var1) {
      if (var1.h0 && !this.h0) {
         this.k5 = 5;
      } else {
         this.k5 = var1.k5;
         switch (this.getFillType()) {
            case 0:
            default:
               break;
            case 1:
               this.t2().n5(var1.t2());
               break;
            case 2:
               this.s7().n5((i7b)var1.s7());
               break;
            case 3:
               this.x8().n5((i7b)var1.x8());
               break;
            case 4:
               this.n3().n5((i7b)var1.n3());
         }
      }
   }

   final void l6(f6a var1) {
      this.u3 = var1.u3;
   }

   void n5(i7b var1, FillFormat var2) {
      this.n5(var1);
      this.k5(var2);
      IPresentationComponent var3 = var2.getParent_IPresentationComponent();
      if (com.aspose.slides.internal.v6g.k5.l6(var3, SmartArtShape.class)) {
         SmartArtShape var4 = com.aspose.slides.internal.v6g.k5.n5(var3, SmartArtShape.class);
         if (var4.y4().c8().t4() || var4.y4().c8().z3()) {
            this.k5 = 0;
         }

         if (var2.getRotateWithShape() == -1 && var4.m3().k5().m3() == null) {
            this.u3 = 0;
         }
      }

      if (com.aspose.slides.internal.v6g.k5.l6(var3, SmartArtShape.class) || com.aspose.slides.internal.v6g.k5.l6(var3, AutoShape.class)) {
         GeometryShape var5 = com.aspose.slides.internal.v6g.k5.n5(var3, GeometryShape.class);
         if (var5.e2().x8() == 0 && var2.getFillType() == 2 && var2.getGradientFormat() != null && var2.getGradientFormat().getGradientShape() == 3) {
            this.s7().a6 = 2;
            this.s7().l6 = 4;
         }
      }
   }

   final void k5(FillFormat var1) {
      if (var1.getFillType() != -1) {
         this.k5 = var1.getFillType();
         if (var1.getRotateWithShape() != -1) {
            this.u3 = var1.getRotateWithShape();
         }
      }

      if (var1.getFillType() == 1 && ((ColorFormat)var1.getSolidFillColor()).z3()) {
         this.t2().n5((ColorFormat)var1.getSolidFillColor());
      } else if (var1.getFillType() == 2 && ((GradientFormat)var1.getGradientFormat()).z3()) {
         this.s7().n5((GradientFormat)var1.getGradientFormat());
      } else if (var1.getFillType() == 3 && ((PatternFormat)var1.getPatternFormat()).z3()) {
         this.x8().n5((PatternFormat)var1.getPatternFormat());
      } else if (var1.getFillType() == 4 && ((PictureFillFormat)var1.getPictureFillFormat()).z3()) {
         this.n3().n5((PictureFillFormat)var1.getPictureFillFormat());
      }
   }

   static boolean u3(FillFormat var0) {
      IPresentationComponent var1 = var0.getParent_IPresentationComponent();
      if (com.aspose.slides.internal.v6g.k5.l6(var1, SmartArtShape.class)) {
         SmartArtShape var2 = com.aspose.slides.internal.v6g.k5.n5(var1, SmartArtShape.class);
         if (var2.y4().c8().t4() || var2.y4().c8().z3()) {
            return true;
         }

         if (var0.getRotateWithShape() == -1 && var2.m3().k5().m3() == null) {
            return true;
         }
      }

      if (com.aspose.slides.internal.v6g.k5.l6(var1, SmartArtShape.class) || com.aspose.slides.internal.v6g.k5.l6(var1, AutoShape.class)) {
         GeometryShape var3 = com.aspose.slides.internal.v6g.k5.n5(var1, GeometryShape.class);
         if (var3.e2().x8() == 0 && var0.getFillType() == 2 && var0.getGradientFormat() != null && var0.getGradientFormat().getGradientShape() == 3) {
            return true;
         }
      }

      return false;
   }

   @Override
   void n5(IBaseSlide var1, w6a var2) {
      switch (this.getFillType()) {
         case 0:
         default:
            break;
         case 1:
            this.t2().n5(var1, var2);
            break;
         case 2:
            this.s7().n5(var1, var2);
            break;
         case 3:
            this.x8().n5(var1, var2);
            break;
         case 4:
            this.n3().n5(var1, var2);
      }
   }

   boolean k5(f6a var1) {
      if (var1 == null) {
         return false;
      }

      if (com.aspose.slides.ms.System.j8.l6(this, var1)) {
         return true;
      }

      if (this.getFillType() != var1.getFillType()) {
         return false;
      }

      if (this.c8() != var1.c8()) {
         return false;
      }

      switch (this.getFillType()) {
         case -1:
         case 0:
         default:
            return true;
         case 1:
            return this.t2().equals(var1.t2());
         case 2:
            return this.s7().n5(var1.s7()) && this.u3 == var1.u3;
         case 3:
            return this.x8().n5(var1.x8()) && this.u3 == var1.u3;
         case 4:
            return this.n3().n5(var1.n3()) && this.u3 == var1.u3;
      }
   }

   static f6a a6(FillFormat var0) {
      f6a var1 = n5(f6a.class, var0, new f6a$1());
      return var1 != null && var1.getFillType() == 5 ? null : var1;
   }

   private static f6a l6(FillFormat var0, f6a var1) {
      f6a var2 = new f6a(var0);
      var2.n5((i7b)var1);
      return var2;
   }

   // $VF: synthetic method
   @Override

   boolean n5(g8 recoveredArg) {
      return this.k5((com.aspose.slides.f6a)recoveredArg);
   }



   // $VF: synthetic method
   static f6a n5(FillFormat var0, f6a var1) {
      return l6(var0, var1);
   }
}
