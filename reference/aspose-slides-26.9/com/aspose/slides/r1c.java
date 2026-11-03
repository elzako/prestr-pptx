package com.aspose.slides;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.Collections.Generic.List$Enumerator;
import com.aspose.slides.exceptions.ArgumentException;
import com.aspose.slides.ms.System.IDisposable;

final class r1c extends e3 {
   private final float c8;
   private final float t2;
   private final float s7;
   private final float x8;
   private float n3;
   private float y4;
   private float e2;
   private boolean t9;
   private float z1;
   private float t4;
   private com.aspose.slides.internal.w0.c8 q0;

   public r1c(com.aspose.slides.internal.o9b.l6 var1, float var2, float var3) {
      this(var1, var2, var3, false);
   }

   public r1c(com.aspose.slides.internal.o9b.l6 var1, float var2, float var3, boolean var4) {
      super(var1, var4);
      this.c8 = var1.e2();
      this.t2 = var1.h0();
      this.s7 = 576.0F * var1.e2() / var2;
      this.x8 = 576.0F * var1.h0() / var3;
      this.n5(new com.aspose.slides.internal.w0.c8());
   }

   @Override
   public float c8() {
      return this.s7;
   }

   @Override
   public float t2() {
      return this.x8;
   }

   @Override
   public int s7() {
      return com.aspose.slides.internal.v6g.k5.u3(this.c8 * 576.0 / this.s7, 14);
   }

   @Override
   public int x8() {
      return com.aspose.slides.internal.v6g.k5.u3(this.t2 * 576.0 / this.x8, 14);
   }

   @Override
   protected com.aspose.slides.internal.w0.c8 n3() {
      return this.q0;
   }

   @Override
   protected void n5(com.aspose.slides.internal.w0.c8 var1) {
      if (var1 != null) {
         this.q0 = var1.k5();
         this.l6.l6(com.aspose.slides.internal.n8e.n1.l6(var1.k5()));
         this.l6.n5(-this.e2, 1);
         this.l6.n5(this.c8() / 576.0F, this.t2() / 576.0F, 1);
         this.l6.n5(this.e2, 1);
         if (!this.t9) {
            this.z1 = this.l6.m1().n5()[4] - this.n3;
            this.t4 = this.l6.m1().n5()[5] - this.y4;
            this.t9 = true;
         }

         this.l6.l6(-this.z1, -this.t4, 1);
      } else {
         this.q0 = null;
         this.l6.l6(new com.aspose.slides.internal.x4g.m1(this.c8() / 576.0F, 0.0F, 0.0F, this.t2() / 576.0F, 0.0F, 0.0F));
      }

      this.h0();
   }

   @Override
   public void n5(com.aspose.slides.internal.x4g.s7 var1, l6v var2, a1v var3) {
      com.aspose.slides.internal.o9b.u3 var4 = null;
      com.aspose.slides.internal.o9b.m3 var5 = null;
      int var6 = this.l6.t9();

      try {
         if (var3 != null && var3.u3() != 0) {
            boolean var7 = false;
            q3d var8 = com.aspose.slides.internal.v6g.k5.n5(var3, q3d.class);
            if (var8 != null) {
               PictureFillFormat var9 = var8.y2();
               var7 = var9 != null && var3.u9().n5() && k8s.n5(var9.getPicture().getImageTransform());
            }

            if (var8 != null && var8.a0() && var7) {
               com.aspose.slides.internal.o9b.a0 var16 = this.l6.u9();
               if (var8.e2() != null) {
                  this.l6.l6(new com.aspose.slides.internal.o9b.a0(var8.e2()));
               }

               com.aspose.slides.internal.n8e.k7.n5(this.l6, var8.p8(), var8.o0().y4());
               this.l6.l6(var16);
            } else {
               var4 = d4.n5(var3, this);
               if (com.aspose.slides.internal.v6g.k5.l6(var4, com.aspose.slides.internal.o9b.u6.class)
                  && com.aspose.slides.internal.v6g.k5.l6(var3, m2a.class)
                  && com.aspose.slides.internal.v6g.k5.n5(var3, m2a.class).y4() != -1) {
                  float[] var15 = this.l6.m1().n5();
                  com.aspose.slides.internal.x4g.m1 var10 = new com.aspose.slides.internal.x4g.m1(var15[0], var15[1], var15[2], var15[3], 0.0F, 0.0F);
                  if (!var10.l6() && var10.k5()) {
                     var10.h0();
                     ((com.aspose.slides.internal.o9b.u6)var4).l6(var10, 0);
                  }
               }

               if (this.n5(var8, var4)) {
                  this.l6.a6(2);
               }

               this.l6.n5(var4, var1);
            }
         }

         if (var2 != null && var2.u9()) {
            if (var2.n5() > 3.0) {
               var1.y4();
            }

            var5 = var2.q0();
            boolean var14 = var2.s7() == 0 && var2.x8() == 0 || this.n5(var1);
            if (var14) {
               com.aspose.slides.internal.n2d.y4.n5(this.l6, var5, var1);
            } else {
               this.n5(var1, var2, var5);
            }
         }
      } finally {
         this.l6.a6(var6);
         if (var4 != null) {
            var4.dispose();
         }

         if (var5 != null) {
            var5.dispose();
         }
      }
   }

   private void n5(com.aspose.slides.internal.x4g.s7 var1, l6v var2, com.aspose.slides.internal.o9b.m3 var3) {
      com.aspose.slides.internal.x4g.s7 var4 = null;
      com.aspose.slides.internal.x4g.s7 var5 = null;
      com.aspose.slides.internal.x4g.s7[] var6 = new com.aspose.slides.internal.x4g.s7[]{var4};
      com.aspose.slides.internal.x4g.s7[] var7 = new com.aspose.slides.internal.x4g.s7[]{var5};
      com.aspose.slides.internal.x4g.s7 var8 = n5(var1, var2, var6, var7);
      var4 = var6[0];
      var5 = var7[0];
      if (var4 != null) {
         var3.l6(new com.aspose.slides.internal.x4g.l6(0.0F, 0.0F));
         var3.u3(0);
         this.n5(var4, var2.s7(), var3);
      }

      if (var5 != null) {
         var3.n5(new com.aspose.slides.internal.x4g.l6(0.0F, 0.0F));
         var3.a6(0);
         this.n5(var5, var2.x8(), var3);
      }

      com.aspose.slides.internal.n2d.y4.n5(this.l6, var3, var8);
   }

   private void n5(com.aspose.slides.internal.x4g.s7 var1, byte var2, com.aspose.slides.internal.o9b.m3 var3) {
      if (var2 == 5) {
         var3.u3(2);
         var3.a6(2);
         var3.k5(0);
         var3.u9(0);
         com.aspose.slides.internal.n2d.y4.n5(this.l6, var3, var1);
      } else {
         this.l6.n5(var3.l6(), var1);
      }
   }

   @Override
   public void n5(com.aspose.slides.internal.o9b.t4 var1, int var2, int var3) {
      this.l6.n5(var1, var2, var3);
   }

   @Override
   public void n5(com.aspose.slides.internal.o9b.t4 var1, int var2, int var3, int var4, int var5) {
      this.l6.n5(var1, var2, var3, var4, var5);
   }

   @Override
   public void n5(com.aspose.slides.internal.o9b.t4 var1, float var2, float var3) {
      this.l6.n5(var1, var2, var3);
   }

   @Override
   public void n5(com.aspose.slides.internal.o9b.t4 var1, float var2, float var3, float var4, float var5) {
      this.l6.n5(var1, var2, var3, var4, var5);
   }

   @Override
   public void n5(IPPImage var1, com.aspose.slides.internal.o9b.y1 var2, com.aspose.slides.internal.o9b.y1 var3, a6l var4) {
      if (com.aspose.slides.internal.n8e.k7.h0(((PPImage)var1).h0())) {
         com.aspose.slides.internal.n8e.k7.n5(this.l6, ((PPImage)var1).h0(), var2);
      } else {
         com.aspose.slides.internal.o9b.t4 var5 = ((PPImage)var1).c8();

         try {
            this.l6.n5(var5, var2.y4(), var3.y4(), 2);
         } finally {
            if (var5 != null) {
               var5.dispose();
            }
         }
      }
   }

   @Override
   public void n5(String var1, com.aspose.slides.internal.o9b.y1 var2, TextParam var3) {
      if (!com.aspose.slides.ms.System.d1.n5(var1)) {
         if (var3.e2() != 1) {
            boolean var4 = com.aspose.slides.ms.System.t9.a6(var1, 0);
            int var5 = var4 ? com.aspose.slides.ms.System.t9.n5(var1.charAt(0), var1.charAt(1)) : var1.charAt(0);
            e4z var6 = var3.d2();
            if (!var6.n5(var5) && var3.u3 == null) {
               var6 = var3.d5();
            }

            this.n5(var1, var2.y4(), var3, var6);
         } else {
            this.l6(var1, var2.y4(), var3);
         }
      }
   }

   private void n5(
      com.aspose.slides.internal.x4g.s7 var1,
      String var2,
      com.aspose.slides.internal.o9b.y4 var3,
      int var4,
      float var5,
      TextParam var6,
      com.aspose.slides.internal.o9b.w1 var7,
      float[] var8
   ) {
      v7z.n5(var1, var2, var3, var4, var5, var6, var7.u3(), var8, this.a6);
   }

   private void n5(
      com.aspose.slides.internal.x4g.s7 var1,
      String var2,
      com.aspose.slides.internal.o9b.y4 var3,
      int var4,
      float var5,
      TextParam var6,
      com.aspose.slides.internal.o9b.w1 var7
   ) {
      this.n5(var1, var2, var3, var4, var5, var6, var7.u3(), null);
   }

   @Override
   void n5(String var1, com.aspose.slides.internal.o9b.y1 var2, TextParam var3, e4z var4) {
      boolean var5 = true;
      var1 = var4.n5(var1);
      if (var1.length() > 2 && (var1.charAt(0) == 8237 || var1.charAt(0) == 8235) && var1.charAt(var1.length() - 1) == 8236) {
         var5 = false;
         com.aspose.slides.internal.l7h.a5 var6 = new com.aspose.slides.internal.l7h.a5();

         for (int var7 = 0; var7 < var1.length(); var7++) {
            if (var1.charAt(var7) == 8205 || var1.charAt(var7) == 8237 || var1.charAt(var7) == 8238 || var1.charAt(var7) == 8236 || var1.charAt(var7) == 8236) {
               for (int var8 = 0; var8 < var1.length(); var8++) {
                  if (var1.charAt(var8) != 8205
                     && var1.charAt(var8) != 8237
                     && var1.charAt(var8) != 8238
                     && var1.charAt(var8) != 8236
                     && var1.charAt(var8) != 8236) {
                     var6.n5(var1.charAt(var8));
                  }
               }

               var1 = var6.toString();
               break;
            }
         }

         var6 = new com.aspose.slides.internal.l7h.a5();
         com.aspose.slides.internal.x7n.y4 var44 = com.aspose.slides.internal.x7n.x8.l6(var1);

         while (var44.hasNext()) {
            String var46 = (String)var44.next();
            var6.n5(0, var46);
         }

         var1 = var6.toString();
      }

      com.aspose.slides.internal.o9b.n3 var43 = var4.n5();
      int var45 = var43.x8();
      com.aspose.slides.internal.o9b.y4 var47 = var43.l6();
      float var9 = var3.t4();
      var1 = var1.replaceAll("\u000b", "");
      com.aspose.slides.internal.o9b.u3 var10 = var3.u3() != null ? d4.k5(var3.u3()) : com.aspose.slides.internal.o9b.a6.k5();
      int var11 = com.aspose.slides.internal.n8e.k7.n5(this.c8, this.t2);
      int var12 = com.aspose.slides.internal.v6g.k5.u3(72.0F / var11 * 72.0F, 13);
      if (var12 < 72 && var4.u9()) {
         float var13 = var12 / 72.0F;
         var12 = com.aspose.slides.internal.v6g.k5.u3(var12 * var13, 13);
      }

      com.aspose.slides.internal.o9b.m3 var48 = null;
      if (var3.a6() != null) {
         if (var3.a6().u9()) {
            var48 = var3.a6().q0();
            if (var9 <= 18.0F) {
               float var14 = this.c8() / 576.0F;
               float var15 = this.t2() / 576.0F;
               float var16 = var14 > var15 ? var14 : var15;
               if (var48.q0() >= 1.0F && var16 >= 1.0F) {
                  var48.k5(var48.q0() * 0.8F);
               }
            }
         } else {
            var48 = var3.a6().l6(var12);
         }
      }

      float var49 = this.n5(var4);
      com.aspose.slides.internal.o9b.w1 var50 = var2.u9().u3();
      var2.u3(var2.n3() - (var49 + var9 * var3.k5() / 100.0F));
      if (var3.k5() != 0) {
         var9 *= 0.66F;
      }

      com.aspose.slides.internal.o9b.w1 var51 = var2.u9().u3();
      com.aspose.slides.internal.x4g.s7 var17 = new com.aspose.slides.internal.x4g.s7(1);
      boolean var18 = this.n5(var3);
      boolean var19 = var4.l6().n5().d5() != null && !var4.l6().n5().p8() && !var4.l6().n5().f2();
      if (var19
         || !var1.isEmpty() && (com.aspose.slides.ms.System.q1.n5(var3.q0()) > 0.005 || !com.aspose.slides.ms.System.n1.k5(var3.c4()))
         || var18 && com.aspose.slides.internal.n2d.u9.u3((int)var1.charAt(0)) != 2) {
         var5 = false;
         com.aspose.slides.internal.l7h.a5 var20 = new com.aspose.slides.internal.l7h.a5();
         int var21 = Integer.MIN_VALUE;
         int var22 = 0;
         int var23 = 0;
         int var24 = 0;
         int[] var25 = new int[]{0};
         int[] var26 = new int[]{0};
         this.n5(var1, var25, var26);
         var22 = var25[0];
         var23 = var26[0];
         if (com.aspose.slides.internal.n2d.u9.y4(var1.charAt(0)) == 2) {
            com.aspose.slides.internal.l7h.a5 var27 = new com.aspose.slides.internal.l7h.a5();
            com.aspose.slides.internal.x7n.y4 var28 = com.aspose.slides.internal.x7n.x8.l6(var1);
            List var29 = new List();

            while (var28.hasNext()) {
               var29.addItem(var28.n5());
            }

            var29.reverse();
            List$Enumerator var30 = var29.iterator();

            try {
               while (var30.hasNext()) {
                  String var31 = (String)var30.next();
                  var27.n5(var31);
               }
            } finally {
               if (com.aspose.slides.internal.v6g.k5.n5(var30, IDisposable.class)) {
                  var30.dispose();
               }
            }

            var1 = var27.toString();
         }

         do {
            if ((var22 == var23 || !com.aspose.slides.internal.n2d.u9.n3(var1.charAt(var22))) && var20.l6() > 0) {
               String var64 = var20.toString();
               var20.l6(0, var20.l6());
               if (var3.z8() != null) {
                  float[] var66 = new float[var64.length()];
                  com.aspose.slides.ms.System.u3.n5(
                     com.aspose.slides.ms.System.u3.n5((Object)(var3.z8())), var24, com.aspose.slides.ms.System.u3.n5((Object)(var66)), 0, var64.length()
                  );
                  this.n5(var17, var64, var47, var45, var9, var3, var51.u3(), var66);
                  var24 += var64.length();
               } else {
                  this.n5(var17, var64, var47, var45, var9, var3, var51.u3());
                  var51.n5(var51.l6() + this.n5(var64, var3).l6());
                  var21 = var64.length() == 1 ? var64.charAt(0) : Integer.MIN_VALUE;
               }
            }

            if (var22 < var23) {
               if (com.aspose.slides.internal.n2d.u9.x8(var1.charAt(var22)) == 4) {
                  var20.n5('\u200d');
                  var20.n5(var1.charAt(var22++));
                  var20.n5('\u200d');
               } else if (com.aspose.slides.ms.System.t9.a6(var1.charAt(var22))) {
                  char[] var10001 = new char[]{var1.charAt(var22), '\u0000'};
                  var10001[1] = var1.charAt(++var22);
                  var20.n5(var10001);
                  var22++;
               } else {
                  var20.n5(var1.charAt(var22++));
               }

               if (!var18 && var20.l6() == 1) {
                  var51.n5(var51.l6() + (float)this.n5(var4.l6().n5(), var9, var20.toString(), var21));
               }
            }
         } while (var20.l6() > 0);
      } else {
         this.n5(var17, var1, var47, var45, var9, var3, var51.u3(), var3.z8());
      }

      this.n5(var17, var50.u3(), var10, var48, var4, var3, this.l6);
      com.aspose.slides.internal.e1x.u6 var52 = var4.l6().n5().h0().l6(72);
      float var53 = var3.l6() == 4 ? 15.0F : 17.0F;
      if (var5 && com.aspose.slides.internal.v6g.k5.l6(var10, com.aspose.slides.internal.o9b.i1.class) && var52.k5() < 300 && var9 < var53) {
         this.l6.c8(3);
         var17.t2();
         if (var4.u9()) {
            var45 |= 1;
         }

         if (this.l6.m1().n5()[0] > 0.0F && this.l6.m1().n5()[3] > 0.0F && this.l6.m1().n5()[1] == 0.0F && this.l6.m1().n5()[2] == 0.0F && var4.u9()) {
            com.aspose.slides.internal.o9b.n3 var58 = com.aspose.slides.internal.o9b.n3.n5(
               var47, var43.c8() * com.aspose.slides.ms.System.q1.l6(this.l6.m1().n5()[0], this.l6.m1().n5()[3]), var45
            );
            com.aspose.slides.internal.x4g.m1 var60 = this.l6.m1();
            this.l6.a6();
            this.l6.l6(new com.aspose.slides.internal.x4g.m1(1.0F, var60.n5()[1], var60.n5()[2], 1.0F, var60.u3(), var60.a6()));
            int var61 = 0;

            for (com.aspose.slides.internal.x7n.y4 var62 = com.aspose.slides.internal.x7n.x8.l6(var1); var62.hasNext(); var61++) {
               String var63 = (String)var62.next();
               String var65 = com.aspose.slides.ms.System.d1.l6(var1, var61, 1);
               if (var3.z8() != null) {
                  float[] var67 = new float[var65.length()];
                  com.aspose.slides.ms.System.u3.n5(com.aspose.slides.ms.System.u3.n5((Object)(var3.z8())), var61, com.aspose.slides.ms.System.u3.n5((Object)(var67)), 0, 1);
                  com.aspose.slides.internal.o9b.w1 var68 = new com.aspose.slides.internal.o9b.w1(var67[0] * var60.n5()[0], var51.k5() * var60.n5()[3]);
                  this.n5(var17, var62.n5(), var47, var45, var9, var3, var68.u3(), var67);
                  this.l6.n5(var62.n5(), var58, var10, var68.u3(), this.a6);
               } else {
                  this.n5(var17, var62.n5(), var47, var45, var9, var3, var51.u3());
                  this.l6.n5(var62.n5(), var58, var10, new com.aspose.slides.internal.o9b.w1(var51.l6() * var60.n5()[0], var51.k5() * var60.n5()[3]), this.a6);
                  var51.n5(var51.l6() + this.n5(var65, var3).l6());
               }
            }

            this.l6.l6(var60);
         } else {
            com.aspose.slides.internal.o9b.n3 var57 = com.aspose.slides.internal.o9b.n3.n5(var47, var43.c8(), var45);
            this.n5(var17, var1, var47, var45, var9, var3, var51.u3(), var3.z8());
            if (var3.z8() == null) {
               this.l6.n5(var1, var57, var10, var51.u3(), this.a6);
            } else {
               this.l6.n5(var10, var17);
            }
         }

         this.l6.c8(4);
      } else {
         this.l6.n5(var10, var17);
         if (var4.u9()) {
            com.aspose.slides.internal.o9b.m3 var56 = new com.aspose.slides.internal.o9b.m3(var10, var4.h0() * 0.02F);

            try {
               this.l6.n5(var56, var17);
            } finally {
               if (var56 != null) {
                  var56.dispose();
               }
            }
         }

         this.l6(var17, var50.u3(), var10, var48, var4, var3, this.l6);
      }

      if (var48 != null) {
         this.l6.n5(var48, var17);
      }

      var17.dispose();
      var10.dispose();
      if (var48 != null) {
         var48.dispose();
      }
   }

   private float n5(e4z var1) {
      float var2 = 96.0F;

      try {
         com.aspose.slides.internal.o9b.n3 var3 = var1.n5();
         int var4 = var3.x8();
         com.aspose.slides.internal.o9b.y4 var5 = var3.l6();
         float var6 = var5.k5(var4);
         float var7 = var5.h0(var4);
         float var8 = var3.n5(96.0F);
         return var6 / var7 * var8;
      } catch (ArgumentException var9) {
         return this.n5(var1, 96.0F);
      }
   }

   private float n5(e4z var1, float var2) {
      com.aspose.slides.internal.e1x.i1 var3 = var1.l6().n5();
      boolean var4 = (var3.e2() & 128) != 0;
      float var5 = var4 ? var3.t9() : var3.s7();
      float var6 = var4 ? var3.t4() : var3.y4();
      float var7 = var1.h0() * var2 / 72.0F;
      float var8 = var7 * (var6 / var3.t2());
      return var5 / var6 * var8;
   }

   private boolean n5(TextParam var1) {
      String var2 = "en-US";
      if (var1.a6 != null && var1.a6.getLanguageId() != null) {
         var2 = var1.a6.getLanguageId();
      }

      return var1.a6 != null && var1.z1() < var1.a6.getKerningMinimalSize() && !"Arab".equals(Fonts.n5(var2)) && !var1.a6.getKumimoji();
   }

   private void n5(
      com.aspose.slides.internal.x4g.s7 var1,
      com.aspose.slides.internal.o9b.w1 var2,
      com.aspose.slides.internal.o9b.u3 var3,
      com.aspose.slides.internal.o9b.m3 var4,
      e4z var5,
      TextParam var6,
      com.aspose.slides.internal.o9b.z1 var7
   ) {
      if (var6.o0() || var6.b3() || var6.x8() || var6.n3()) {
         if (var6.o0() && !var6.u6()) {
            if (var6.t2 != null) {
               c8k var8 = new c8k(var6.t2);
               var8.n5(this, var1, var6);
            }

            if (var6.n3 != null && var6.u6()) {
               i5q var9 = new i5q(var6.n3);
               var9.n5(this, var1, var6.u3(), null);
            }
         }

         if (var6.b3()) {
            q1k var10 = new q1k(var6.c8);
            var10.n5(this, var1, var6, var2.u3());
         }

         if (var6.x8() && !var6.u6()) {
            this.n5(var6.x8, var1, var3, var4, var5, var6, var7, true);
            this.n5(var6.s7, var1, var3, var4, var5, var6, var7, false);
         }

         if (var6.n3()) {
            this.n5(var1, var3, var6.h0().o8(), var6.t4(), var7);
         }
      }
   }

   private void n5(
      IOuterShadowEffectiveData var1,
      com.aspose.slides.internal.x4g.s7 var2,
      com.aspose.slides.internal.o9b.u3 var3,
      com.aspose.slides.internal.o9b.m3 var4,
      e4z var5,
      TextParam var6,
      com.aspose.slides.internal.o9b.z1 var7,
      boolean var8
   ) {
      if (var1 != null) {
         float var9 = var6.t4();
         z2r var10 = new z2r(var1, var8);
         if (!(var1.getBlurRadius() > 2.0) || var9 <= 18.0F && var1.getBlurRadius() < 4.0) {
            com.aspose.slides.internal.x4g.s7 var11 = com.aspose.slides.internal.v6g.k5.n5(var2.deepClone(), com.aspose.slides.internal.x4g.s7.class);

            try {
               com.aspose.slides.internal.x4g.m1 var12 = var10.n5(var6, var11.s7().y4(), var9, true);
               var11.l6(var12);
               boolean var13 = false;
               if (var3 != null) {
                  com.aspose.slides.internal.o9b.i1 var14 = com.aspose.slides.internal.v6g.k5.n5(var3, com.aspose.slides.internal.o9b.i1.class);
                  com.aspose.slides.internal.o9b.c8 var15 = ((k0p)var1).l6().o8();
                  if (var14 != null) {
                     n2d.n5(((k0p)var1).l6().o8(), var14.h0().s7()).n5(var15);
                  }

                  com.aspose.slides.internal.o9b.i1 var16 = new com.aspose.slides.internal.o9b.i1(var15.o8());

                  try {
                     if (var5.u9()) {
                        com.aspose.slides.internal.o9b.m3 var17 = new com.aspose.slides.internal.o9b.m3(var16, var5.h0() * 0.02F);

                        try {
                           var7.n5(var17, var11);
                        } finally {
                           if (var17 != null) {
                              var17.dispose();
                           }
                        }
                     }

                     if (var14 != null) {
                        if ((var14.h0().s7() & 255) > 0) {
                           var7.n5(var16, var11);
                        }
                     } else {
                        var7.n5(var16, var11);
                     }

                     var13 = true;
                  } finally {
                     if (var16 != null) {
                        var16.dispose();
                     }
                  }
               }

               if (var4 != null && var4.q0() > 0.0F) {
                  com.aspose.slides.internal.o9b.c8 var42 = ((k0p)var1).l6().o8();
                  if (var4.z1() == 0) {
                     n2d.n5(((k0p)var1).l6().o8(), var4.k5().s7()).n5(var42);
                  }

                  if (var13 && (var42.s7() & 255) <= 200) {
                     n5(var42.o8()).n5(var42);
                  }

                  com.aspose.slides.internal.o9b.m3 var43 = new com.aspose.slides.internal.o9b.m3(var42.o8(), var4.q0());

                  try {
                     var7.n5(var43, var11);
                  } finally {
                     if (var43 != null) {
                        var43.dispose();
                     }
                  }
               }
            } finally {
               if (var11 != null) {
                  var11.dispose();
               }
            }
         } else {
            var10.n5(this, var2, var6);
         }
      }
   }

   private void n5(
      com.aspose.slides.internal.x4g.s7 var1,
      com.aspose.slides.internal.o9b.u3 var2,
      com.aspose.slides.internal.o9b.c8 var3,
      float var4,
      com.aspose.slides.internal.o9b.z1 var5
   ) {
      if (var1 != null) {
         com.aspose.slides.internal.x4g.s7 var6 = com.aspose.slides.internal.v6g.k5.n5(var1.deepClone(), com.aspose.slides.internal.x4g.s7.class);
         com.aspose.slides.internal.o9b.w1 var7 = this.r4().u3();
         com.aspose.slides.internal.x4g.m1 var8 = new com.aspose.slides.internal.x4g.m1();
         var8.k5(var7.l6() * var4 / 15.0F, var7.k5() * var4 / 15.0F);
         var6.l6(var8);
         com.aspose.slides.internal.o9b.c8 var9 = n5(var3.o8()).o8();
         com.aspose.slides.internal.o9b.i1 var10 = new com.aspose.slides.internal.o9b.i1(var9.o8());

         try {
            com.aspose.slides.internal.o9b.i1 var11 = com.aspose.slides.internal.v6g.k5.n5(var2, com.aspose.slides.internal.o9b.i1.class);
            if (var11 != null && (var11.h0().s7() & 255) > 0) {
               var5.n5(var10, var6);
            }
         } finally {
            if (var10 != null) {
               var10.dispose();
            }
         }
      }
   }

   private void l6(
      com.aspose.slides.internal.x4g.s7 var1,
      com.aspose.slides.internal.o9b.w1 var2,
      com.aspose.slides.internal.o9b.u3 var3,
      com.aspose.slides.internal.o9b.m3 var4,
      e4z var5,
      TextParam var6,
      com.aspose.slides.internal.o9b.z1 var7
   ) {
      if (var6.z7()) {
         m8i var8 = new m8i(var6.y4);
         var8.n5(this, var1, var6);
      }
   }

   @Override
   com.aspose.slides.internal.o9b.y1 t9() {
      return this.l6.h0();
   }

   @Override
   void n5(com.aspose.slides.internal.o9b.y1 var1) {
      this.l6.n5(var1.y4());
   }

   private void n5(String var1, int[] var2, int[] var3) {
      var2[0] = 0;
      var3[0] = var1.length();
      if (var1.charAt(0) == 8237) {
         var2[0]++;
      }

      if (var1.charAt(var1.length() - 1) == 8236) {
         var3[0]--;
      }
   }

   private boolean n5(q3d var1, com.aspose.slides.internal.o9b.u3 var2) {
      if (var1 != null && !var1.a0()) {
         com.aspose.slides.internal.o9b.u6 var3 = com.aspose.slides.internal.v6g.k5.n5(var2, com.aspose.slides.internal.o9b.u6.class);
         if (var3 != null) {
            float var4 = 128.0F;
            return com.aspose.slides.ms.System.q1.n5(var3.s7().l6(), var3.s7().k5()) > var4;
         } else {
            return false;
         }
      } else {
         return false;
      }
   }
}
