package com.aspose.slides;

class l1z extends v6g {
   private final g3y n5;
   private IMarker l6;
   private float k5;
   private int u3;
   private int a6;
   private boolean u9 = false;

   public l1z(IMarker var1, g3y var2) {
      this.l6 = var1;
      this.n5 = var2;
      this.u3 = this.l6.getSize() != 0 ? this.l6.getSize() : this.n5.s7().n5().getSize();
      this.a6 = this.l6.getSymbol() != -1 ? this.l6.getSymbol() : this.n5.s7().n5().getSymbol();
      if (!com.aspose.slides.internal.v6g.k5.l6(this.y1(), x2k.class)
         && this.n5 != null
         && this.n5.u9().getFormat().getLine().getFillFormat().getFillType() == 0) {
         this.u9 = true;
      }
   }

   @Override
   public int O_() {
      return this.u9 ? 5 : this.y1().O_();
   }

   @Override
   public boolean T_() {
      return this.l6.getSymbol() != 4 && super.T_();
   }

   @Override
   public void l6(boolean var1) {
      super.l6(var1);
   }

   public final boolean u3() {
      return this.u3 == 0;
   }

   public final int h0() {
      return this.u3;
   }

   public final int c8() {
      return this.a6 != -1 ? this.a6 : n5(this.n5.u9().n5().n5());
   }

   @Override
   protected void u3(z5 var1) {
      int var2 = com.aspose.slides.internal.v6g.k5.u3(com.aspose.slides.ms.System.q1.l6(var1.l6(), var1.n5()), 13);
      if (this.u3()) {
         double var3 = this.n5.u9().getFormat().getLine().getWidth();
         if (com.aspose.slides.ms.System.d2.k5(var3)) {
            var3 = w5k.n5(this.n5.u9().getChart());
         }

         this.u3 = com.aspose.slides.internal.v6g.k5.u3(var3 * 2.0, 14) + 3;
      }

      this.u3 = com.aspose.slides.ms.System.q1.l6(this.u3, var2);
      this.k5(this.u3);
      this.u3(this.u3);
      if (com.aspose.slides.internal.v6g.k5.l6(this.y1(), x2k.class)) {
         this.k5 = this.d5() - this.d5() / 4.0F;
      } else {
         this.k5 = 1584.0F;
      }
   }

   @Override
   protected void l6() {
      com.aspose.slides.internal.o9b.y1 var1 = new com.aspose.slides.internal.o9b.y1(this.y2().p8(), this.y2().f2(), this.y2().d2(), this.y2().d5());
      f9 var2 = new f9(this.n5.t2());
      var2.n5(var1.y4());

      try {
         LineFormat var3 = (LineFormat)this.l6.getFormat().getLine();
         FillFormat var4 = (FillFormat)this.l6.getFormat().getFill();
         if (var3.getFillFormat().getFillType() == -1) {
            var3 = (LineFormat)this.n5.u9().getMarker().getFormat().getLine();
         }

         if (var4.getFillType() == -1) {
            var4 = (FillFormat)this.n5.u9().getMarker().getFormat().getFill();
         }

         switch (this.c8()) {
            case -1:
            case 4:
            default:
               break;
            case 0:
               this.u3(var4, var3);
               break;
            case 1:
               this.h0(var4, var3);
               break;
            case 2:
               this.n5(var4, var3);
               break;
            case 3:
               this.c8(var4, var3);
               break;
            case 5:
               if (var4.getFillType() == 4) {
                  this.s7(var4, var3);
               } else {
                  this.k5(var4, var3);
               }
               break;
            case 6:
               this.u9(var4, var3);
               break;
            case 7:
               this.k5(var4, var3);
               break;
            case 8:
               this.t2(var4, var3);
               break;
            case 9:
               this.l6(var4, var3);
               break;
            case 10:
               this.a6(var4, var3);
         }
      } finally {
         var2.n5();
      }
   }

   private void n5(FillFormat var1, LineFormat var2) {
      com.aspose.slides.internal.x4g.s7 var3 = new com.aspose.slides.internal.x4g.s7();
      com.aspose.slides.internal.o9b.w1[] var4 = new com.aspose.slides.internal.o9b.w1[]{
         new com.aspose.slides.internal.o9b.w1(this.p8(), this.i1().k5()),
         new com.aspose.slides.internal.o9b.w1(this.i1().l6(), this.f2()),
         new com.aspose.slides.internal.o9b.w1(this.p8() + this.u3, this.i1().k5()),
         new com.aspose.slides.internal.o9b.w1(this.i1().l6(), this.f2() + this.u3)
      };
      n5(var3, var4);
      this.n5(var1, var2, var3);
   }

   private void l6(FillFormat var1, LineFormat var2) {
      com.aspose.slides.internal.x4g.s7 var3 = new com.aspose.slides.internal.x4g.s7();
      com.aspose.slides.internal.o9b.w1[] var4 = new com.aspose.slides.internal.o9b.w1[]{
         new com.aspose.slides.internal.o9b.w1(this.i1().l6(), this.f2()),
         new com.aspose.slides.internal.o9b.w1(this.p8() + this.u3, this.f2() + this.u3),
         new com.aspose.slides.internal.o9b.w1(this.p8(), this.f2() + this.u3)
      };
      n5(var3, var4);
      this.n5(var1, var2, var3);
   }

   private void k5(FillFormat var1, LineFormat var2) {
      com.aspose.slides.internal.x4g.s7 var3 = new com.aspose.slides.internal.x4g.s7();
      com.aspose.slides.internal.o9b.w1[] var4 = new com.aspose.slides.internal.o9b.w1[]{
         new com.aspose.slides.internal.o9b.w1(this.p8() + this.u3, this.f2()),
         new com.aspose.slides.internal.o9b.w1(this.p8() + this.u3, this.f2() + this.u3),
         new com.aspose.slides.internal.o9b.w1(this.p8(), this.f2() + this.u3),
         new com.aspose.slides.internal.o9b.w1(this.p8(), this.f2())
      };
      n5(var3, var4);
      this.n5(var1, var2, var3);
   }

   private void u3(FillFormat var1, LineFormat var2) {
      com.aspose.slides.internal.x4g.s7 var3 = new com.aspose.slides.internal.x4g.s7();
      var3.n5(this.e5().y4());
      this.n5(var1, var2, var3);
   }

   private void a6(FillFormat var1, LineFormat var2) {
      this.x8(var1, var2);
      com.aspose.slides.internal.x4g.s7 var3 = new com.aspose.slides.internal.x4g.s7();
      var3.n5(new com.aspose.slides.internal.o9b.w1(this.p8(), this.f2()), new com.aspose.slides.internal.o9b.w1(this.p8() + this.u3, this.f2() + this.u3));
      var3.t9();
      var3.n5(new com.aspose.slides.internal.o9b.w1(this.p8() + this.u3, this.f2()), new com.aspose.slides.internal.o9b.w1(this.p8(), this.f2() + this.u3));
      this.n5(var1, var2, var3);
   }

   private void u9(FillFormat var1, LineFormat var2) {
      this.x8(var1, var2);
      com.aspose.slides.internal.x4g.s7 var3 = new com.aspose.slides.internal.x4g.s7();
      var3.n5(new com.aspose.slides.internal.o9b.w1(this.i1().l6(), this.f2()), new com.aspose.slides.internal.o9b.w1(this.i1().l6(), this.f2() + this.u3));
      var3.t9();
      var3.n5(new com.aspose.slides.internal.o9b.w1(this.p8(), this.i1().k5()), new com.aspose.slides.internal.o9b.w1(this.p8() + this.u3, this.i1().k5()));
      this.n5(var1, var2, var3);
   }

   private void h0(FillFormat var1, LineFormat var2) {
      com.aspose.slides.internal.x4g.s7 var3 = new com.aspose.slides.internal.x4g.s7();
      com.aspose.slides.internal.o9b.y1 var4 = com.aspose.slides.internal.o9b.y1.n5(this.e5().y4(), 0.0F, -this.e5().s7() / 2.5F).y4();
      var3.l6(var4.y4());
      this.n5(var1, var2, var3);
   }

   private void c8(FillFormat var1, LineFormat var2) {
      com.aspose.slides.internal.x4g.s7 var3 = new com.aspose.slides.internal.x4g.s7();
      com.aspose.slides.internal.o9b.y1 var4 = com.aspose.slides.internal.o9b.y1.n5(this.e5().y4(), 0.0F, -this.e5().s7() / 2.5F).y4();
      var4.k5(this.i1().l6());
      var4.l6(this.d2() / 2.0F);
      var3.l6(var4.y4());
      this.n5(var1, var2, var3);
   }

   private void t2(FillFormat var1, LineFormat var2) {
      this.x8(var1, var2);
      com.aspose.slides.internal.x4g.s7 var3 = new com.aspose.slides.internal.x4g.s7();
      var3.n5(new com.aspose.slides.internal.o9b.w1(this.p8(), this.f2()), new com.aspose.slides.internal.o9b.w1(this.p8() + this.u3, this.f2() + this.u3));
      var3.t9();
      var3.n5(new com.aspose.slides.internal.o9b.w1(this.p8() + this.d2(), this.f2()), new com.aspose.slides.internal.o9b.w1(this.p8(), this.f2() + this.u3));
      var3.t9();
      var3.n5(new com.aspose.slides.internal.o9b.w1(this.i1().l6(), this.f2()), new com.aspose.slides.internal.o9b.w1(this.i1().l6(), this.f2() + this.u3));
      this.n5(var1, var2, var3);
   }

   private void s7(FillFormat var1, LineFormat var2) {
      PPImage var3 = (PPImage)var1.getPictureFillFormat().getPicture().getImage();
      float var4 = var3.getWidth() / var3.t2().l6() * 72.0F;
      float var5 = var3.getHeight() / var3.t2().k5() * 72.0F;
      com.aspose.slides.internal.x4g.s7 var6 = new com.aspose.slides.internal.x4g.s7();
      var6.l6(new com.aspose.slides.internal.o9b.y1(this.i1().l6() - var4 / 2.0F, this.i1().k5() - var5 / 2.0F, var4, var5));
      this.n5(var1, var2, var6);
   }

   private void x8(FillFormat var1, LineFormat var2) {
      var2.setCapStyle((byte)2);
      var2.setJoinStyle((byte)0);
      LineFormat var3 = new LineFormat(var2);
      com.aspose.slides.internal.o9b.c8 var4 = com.aspose.slides.internal.o9b.c8.u3.o8();
      var3.setWidth(var2.getEffective().getWidth());
      if (var3.getWidth() > this.k5) {
         var3.setWidth(this.k5);
      }

      if (var1.getFillType() == 3) {
         ((ColorFormat)var1.getPatternFormat().getForeColor()).u3().n5(var4);
      }

      w5k.n5(
         var4.o8(),
         com.aspose.slides.internal.o9b.c8.u3.o8(),
         this.y2().u3(),
         new com.aspose.slides.internal.o9b.y1(this.p8(), this.f2(), this.d2(), this.d5()),
         var3,
         var1,
         null
      );
   }

   private void n5(FillFormat var1, LineFormat var2, com.aspose.slides.internal.x4g.s7 var3) {
      l6v var4 = w5k.l6(this.n5.h0().o8(), var2, this.n5.t2(), (float)var2.getEffective().getWidth());
      var4.u9 = w5k.n5(this.n5.h0().o8(), (LineFillFormat)var2.getFillFormat(), this.n5.t2(), 1.0F, var3);
      if (var4.n5() > this.k5) {
         var4.n5((double)this.k5);
      }

      a1v var5 = w5k.n5(this.n5.u9().c8().o8(), var1, this.n5.t2(), 1.0F, var3);
      this.n5.t2().d2().n5(var3, var4, var5);
   }

   private static void n5(com.aspose.slides.internal.x4g.s7 var0, com.aspose.slides.internal.o9b.w1[] var1) {
      com.aspose.slides.internal.o9b.w1 var2 = var1[0].u3();

      for (int var3 = 1; var3 < var1.length + 1; var3++) {
         com.aspose.slides.internal.o9b.w1 var4 = (var3 == var1.length ? var1[0] : var1[var3]).u3();
         var0.n5(var2.u3(), var4.u3());
         var4.n5(var2);
      }
   }

   static int n5(long var0) {
      var0 = (var0 & 4294967295L) % 9L & 4294967295L;
      var0 = (var0 & 4294967295L) + 2L & 4294967295L;
      switch ((int)var0) {
         case 2:
            return 2;
         case 3:
            return 7;
         case 4:
            return 9;
         case 5:
            return 10;
         case 6:
            return 8;
         case 7:
            return 0;
         case 8:
            return 10;
         case 9:
            return 3;
         case 10:
            return 1;
         default:
            return 4;
      }
   }
}
