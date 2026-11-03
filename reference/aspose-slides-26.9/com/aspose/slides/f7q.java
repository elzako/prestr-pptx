package com.aspose.slides;

class f7q {
   private com.aspose.slides.internal.k0r.l1b n5;
   private com.aspose.slides.internal.k0r.l1b l6;
   private com.aspose.slides.internal.k0r.l1b k5;
   private boolean u3;
   private boolean a6;
   private k1z u9;
   private TextFrame h0;
   private com.aspose.slides.internal.k0r.d3 c8;
   private int t2;
   private com.aspose.slides.internal.k0r.o6t s7;
   private com.aspose.slides.internal.k0r.o6t x8;
   private com.aspose.slides.internal.k0r.o6t n3;
   private com.aspose.slides.internal.k0r.d2a y4 = null;
   private boolean e2 = false;
   private boolean t9 = false;
   private boolean z1 = true;

   f7q(TextFrame var1, k1z var2) {
      this.h0 = var1;
      this.u9 = var2;
      if (var1 != null) {
         this.t9 = var1.n5.z1() == 1;
      }
   }

   public final int n5() {
      return this.t2;
   }

   public final void n5(int var1) {
      this.k5(var1);
   }

   private void k5(int var1) {
      this.t2 = this.u3(var1);
      this.s7 = this.u9.a6().n5().z3()[(int)(this.t2 & 4294967295L)];
      this.x8 = null;
      y2q var2 = null;
      if (this.u9.a6().k5() < 3 && !this.u9.a6().m3()) {
         var2 = this.u9.a6();
      } else {
         var2 = this.u9.a6().n5(0);
      }

      if (var2 != null) {
         com.aspose.slides.internal.k0r.o6t var3 = var2.e2()[(int)(this.t2 & 4294967295L)].l6();
         this.x8 = new com.aspose.slides.internal.k0r.o6t();
         this.x8.k5(var3.y2());
         int var4 = var3.u3().size();

         for (int var5 = 0; var5 < var4; var5++) {
            com.aspose.slides.internal.k0r.l1b var6 = new com.aspose.slides.internal.k0r.l1b();
            this.x8.u3().addItem(var6);
            var6.n5(var3.u3().get_Item(var5));
            if (var5 > 0) {
               var6.n5(this.x8.u3().get_Item(var5 - 1));
            }
         }
      }

      this.e2 = this.t2 != 4 && this.u9.a6().k5() <= 3;
      this.e2 = this.e2 | (this.t2 == 2 && this.u9.a6().k5() == 5);
   }

   private int u3(int var1) {
      int var2 = var1;
      com.aspose.slides.ms.System.o5 var3 = new com.aspose.slides.ms.System.o5();
      TextStyle var4 = this.h0.n5.h0();
      if (var4 != null) {
         this.h0.n5.h0().a6().n5(var3);
      }

      if (!var3.l6()) {
         this.h0.n5.a6().l6().n5(var3);
      }

      if (var3.l6()) {
         var2 = (Integer)var3.n5();
      } else if (var2 != 4 && !this.u9()) {
         var2 = 4;
      }

      if (this.h0.n5.h0() != null) {
         this.h0.n5.h0().n5(new com.aspose.slides.ms.System.o5<>(var2));
      }

      if (var4 != null && this.h0()) {
         g6o var5 = this.u9.a6().n5();
         f8b.n5(this.s7(), var4, var5);
      }

      return var2;
   }

   final void l6(int var1) {
      this.k5(null);
      this.n5((com.aspose.slides.internal.k0r.l1b)null);
      this.l6(null);
      this.n3 = null;
      if (this.x8() != null && (var1 & 65535) < this.x8().u3().size()) {
         this.k5(this.x8().u3().get_Item(var1 & 65535));
      }

      if (this.h0() && this.s7() != null && (var1 & 65535) < this.s7().u3().size()) {
         this.l6(this.s7().u3().get_Item(var1 & 65535));
      }

      if ((!this.h0() || this.u9.a6().n5().n5().m3() == 1) && this.t2() != null && (var1 & 65535) < this.t2().u3().size()) {
         this.n5(this.t2().u3().get_Item(var1 & 65535));
      }
   }

   public final void n5(com.aspose.slides.internal.k0r.n9q var1) {
      com.aspose.slides.internal.k0r.n9q var2 = new com.aspose.slides.internal.k0r.n9q();
      if (this.t9() != null) {
         var1.l6(this.t9().n5());
      }

      if (this.e2() != null) {
         var2.l6(this.e2().n5());
      }

      if (this.y4() != null) {
         var2.l6(this.y4().n5());
      }

      var1.n5(var2);
   }

   public final void n5(com.aspose.slides.internal.k0r.u7f var1) {
      com.aspose.slides.internal.k0r.u7f var2 = new com.aspose.slides.internal.k0r.u7f();
      if (this.t9() != null) {
         var1.l6(this.t9().l6());
      }

      if (this.e2() != null) {
         var2.l6(this.e2().l6());
      }

      if (this.y4() != null) {
         var2.l6(this.y4().l6());
      }

      var1.n5(var2);
   }

   final boolean n5(IParagraphFormat var1, com.aspose.slides.internal.k0r.n9q var2, com.aspose.slides.internal.k0r.u7f var3, IPortionFormat var4, f7q var5) {
      com.aspose.slides.internal.k0r.c9 var6 = this.u9.w1();
      com.aspose.slides.internal.k0r.k9m var7 = var6.x8();
      com.aspose.slides.internal.k0r.v9e var8 = var7.l6() == null ? null : new com.aspose.slides.internal.k0r.v9e();
      String var9 = var4.getLanguageId();
      if (!com.aspose.slides.ms.System.d1.n5(var9)) {
         if (com.aspose.slides.internal.n2d.u9.n5(var9)) {
            var8 = new com.aspose.slides.internal.k0r.v9e();
            var8.k5().n5((byte)1);
         }
      } else if (var1.getRightToLeft() == 1
         || com.aspose.slides.ms.System.o5.n5(var2.k7(), new com.aspose.slides.ms.System.o5<>(1))
         || var1.getRightToLeft() == -1 && var5.t9() != null && com.aspose.slides.ms.System.o5.n5(var5.t9().n5().k7(), new com.aspose.slides.ms.System.o5<>(1))
         )
       {
         var8 = new com.aspose.slides.internal.k0r.v9e();
         var8.k5().n5((byte)1);
      }

      boolean var10 = var1.getBullet() != null;
      boolean var11 = var8 == null || var8.k5().t2();
      if (var11 && !var10) {
         return false;
      }

      if (var10) {
         IBulletFormat var12 = var1.getBullet();
         switch (var12.getType()) {
            case -1:
               if (var12.getNumberedBulletStyle() == -1 && !var11) {
                  if (this.z1()) {
                     var8.n5().n5(new com.aspose.slides.ms.System.o5<>((short)-1));
                  } else {
                     this.n5(true);
                  }
               }
               break;
            case 0:
               if (var12.getNumberedBulletStyle() == -1) {
                  if (this.z1()) {
                     if (var8 == null) {
                        var8 = new com.aspose.slides.internal.k0r.v9e();
                     }

                     var8.n5().n5(new com.aspose.slides.ms.System.o5<>((short)-1));
                     this.n5(false);
                  }
               } else {
                  if (var8 == null) {
                     var8 = new com.aspose.slides.internal.k0r.v9e();
                  }

                  var8.n5().n5((byte)1);
                  this.n5(true);
                  if (var12.getNumberedBulletStartWith() != 1 || var12.getNumberedBulletStyle() != 3) {
                     var8.n5().n5(new com.aspose.slides.internal.k0r.g1p((int)var12.getNumberedBulletStyle(), var12.getNumberedBulletStartWith()));
                  }
               }
               break;
            case 1:
               if (var8 == null) {
                  var8 = new com.aspose.slides.internal.k0r.v9e();
               }

               var8.n5().n5(new com.aspose.slides.ms.System.o5<>((short)-1));
               var8.n5().n5((byte)0);
               this.n5(true);
               break;
            case 2:
               if (var8 == null) {
                  var8 = new com.aspose.slides.internal.k0r.v9e();
               }

               var8.n5().n5((byte)1);
               this.n5(true);
               short var13 = var12.getNumberedBulletStartWith();
               if (var13 < 0) {
                  var13 = 1;
               }

               byte var14 = var12.getNumberedBulletStyle();
               if (var14 == -1) {
                  var14 = 3;
               }

               if (var13 != 1 || var14 != 3) {
                  var8.n5().n5(new com.aspose.slides.internal.k0r.g1p(var14, var13));
               }
               break;
            case 3:
               if (var8 == null) {
                  var8 = new com.aspose.slides.internal.k0r.v9e();
               }

               var8.n5().n5((byte)0);
               var8.n5().n5(new com.aspose.slides.ms.System.o5<>((short)this.u9.u3().a6().n5().n5(((BulletFormat)var12).getPicture().getImage()).u3()));
               this.n5(true);
         }
      }

      if (var8 != null) {
         if (var7 == null) {
            var6.n5(new com.aspose.slides.internal.k0r.k9m());
         }

         com.aspose.slides.internal.k0r.e1 var15 = var6.x8().u9();
         var15.l6(true);
         com.aspose.slides.internal.k0r.t9p var16 = var15.l6();
         int var17 = var16.n5(var8);
         if (var17 > 0) {
            var3.n5(new com.aspose.slides.ms.System.o5<>((byte)var17));
         }
      }

      return var8 != null;
   }

   final void l6() {
      if (this.z1) {
         g5x.n5(this.u9);
         if (this.c8 != null) {
            this.u9.z3().n5(this.c8);
         }

         this.z1 = false;
      }
   }

   private void q0() {
      if (this.c8 == null) {
         this.c8 = new com.aspose.slides.internal.k0r.d3();
         this.c8.l6(true);
      }
   }

   private void z3() {
      this.n3 = new com.aspose.slides.internal.k0r.o6t();
      this.n3.k5((short)this.n5());
      TextStyle var1 = this.n3();
      if (var1 != null && var1.getLevel(0) != null) {
         com.aspose.slides.internal.k0r.o6t var2 = f8b.n5(var1, this.u9.a6().n5());
         this.n3.u3().clear();
         this.n3.u3().addRange(var2.u3());
      }

      Shape var6 = this.u9.s7();
      if (var6 != null) {
         for (AutoShape var3 = com.aspose.slides.internal.v6g.k5.n5(var6.getBasePlaceholder(), AutoShape.class);
            var3 != null && var3.getTextFrame() != null;
            var3 = com.aspose.slides.internal.v6g.k5.n5(var3.getBasePlaceholder(), AutoShape.class)
         ) {
            TextStyle var4 = ((TextFrame)var3.getTextFrame()).n5.h0();
            if (var4 != null && var4.getLevel(0) != null) {
               com.aspose.slides.internal.k0r.o6t var5 = f8b.n5(var4, this.u9.a6().n5());
               this.n3.n5(var5, true);
            }
         }
      }
   }

   final TextFrame k5() {
      return this.h0;
   }

   final com.aspose.slides.internal.k0r.d3 u3() {
      if (this.c8 == null) {
         this.q0();
      }

      return this.c8;
   }

   final com.aspose.slides.internal.k0r.d2a a6() {
      if (this.y4 == null) {
         if (this.t4()) {
            this.y4 = this.u9.a6().n5().h0().z3().l6();
         } else {
            this.y4 = this.u3().l6().n5();
         }
      }

      return this.y4;
   }

   final boolean u9() {
      return this.u9.k7() != null && this.u9.k7().u3() == 0;
   }

   final boolean h0() {
      if (this.u9.a6().k5() <= 3) {
         return this.c8();
      }

      if (this.u9()) {
         return !v0q.n5(this.u9.k7().k5());
      }

      switch (this.t2) {
         case 0:
         case 1:
         case 2:
         case 5:
         case 6:
         case 7:
            return true;
         case 3:
         case 4:
         default:
            return false;
      }
   }

   final boolean c8() {
      return this.e2;
   }

   final com.aspose.slides.internal.k0r.o6t t2() {
      return this.s7;
   }

   final com.aspose.slides.internal.k0r.o6t s7() {
      return this.x8;
   }

   final com.aspose.slides.internal.k0r.o6t x8() {
      if (this.n3 == null) {
         this.z3();
      }

      return this.n3;
   }

   final TextStyle n3() {
      return this.h0.n5.h0();
   }

   final com.aspose.slides.internal.k0r.l1b y4() {
      return this.n5;
   }

   final void n5(com.aspose.slides.internal.k0r.l1b var1) {
      this.n5 = var1;
   }

   final com.aspose.slides.internal.k0r.l1b e2() {
      return this.l6;
   }

   final void l6(com.aspose.slides.internal.k0r.l1b var1) {
      this.l6 = var1;
   }

   final com.aspose.slides.internal.k0r.l1b t9() {
      return this.k5;
   }

   final void k5(com.aspose.slides.internal.k0r.l1b var1) {
      this.k5 = var1;
   }

   final boolean z1() {
      return this.u3;
   }

   final void n5(boolean var1) {
      this.u3 = var1;
   }

   final boolean t4() {
      return this.a6;
   }
}
