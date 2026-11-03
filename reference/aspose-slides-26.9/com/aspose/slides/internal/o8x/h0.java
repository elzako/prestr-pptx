package com.aspose.slides.internal.o8x;

import com.aspose.slides.internal.l7h.a5;
import com.aspose.slides.ms.System.d1;
import com.aspose.slides.ms.System.Xml.f0;
import com.aspose.slides.ms.System.Xml.z9;

public final class h0 extends com.aspose.slides.internal.x6s.a6 implements f0 {
   private c8[] a6;
   private c8[] u9;
   private int h0;
   private int c8;
   private String t2;

   public h0(c8[] var1, int var2, c8[] var3, int var4) {
      this.a6 = var1;
      this.u9 = var3;
      this.h0 = var2;
      this.c8 = var4;
   }

   public h0(h0 var1) {
      this(var1.a6, var1.h0, var1.u9, var1.c8);
      this.t2 = var1.t2;
   }

   @Override
   public String c8() {
      String var1 = this.a6[this.h0].z8();
      if (var1 != null) {
         return var1;
      }

      if (this.c8 != 0) {
         return this.u9[this.c8].z8();
      }

      String var2 = d1.n5;
      a5 var3 = null;
      c8[] var4 = this.a6;
      c8[] var5 = var4;
      c8[] var6 = var4;
      int var7 = this.h0;
      int var8 = this.h0;
      c8[][] var9 = new c8[][]{var5};
      int[] var10 = new int[]{var7};
      boolean var11 = !com.aspose.slides.internal.o8x.t2.u9(var9, var10);
      var5 = var9[0];
      var7 = var10[0];
      if (var11) {
         var5 = null;
         var7 = 0;
      }

      c8[][] var12 = new c8[][]{var6};
      int[] var13 = new int[]{var8};

      while (com.aspose.slides.internal.o8x.t2.n5(var12, var13, var5, var7)) {
         if (var2.length() == 0) {
            var2 = var6[var13[0]].z8();
         } else {
            if (var3 == null) {
               var3 = new a5();
               var3.n5(var2);
            }

            var3.n5(var6[var13[0]].z8());
         }
      }

      return var3 != null ? var3.toString() : var2;
   }

   @Override
   public com.aspose.slides.internal.x6s.a6 n5() {
      return new h0(this.a6, this.h0, this.u9, this.c8);
   }

   @Override
   public int k5() {
      return this.a6[this.h0].n5();
   }

   @Override
   public String u3() {
      return this.a6[this.h0].k5();
   }

   @Override
   public String a6() {
      return this.a6[this.h0].a6();
   }

   @Override
   public String u9() {
      return this.a6[this.h0].u3();
   }

   @Override
   public String h0() {
      return this.a6[this.h0].l6();
   }

   @Override
   public String t2() {
      Object var1 = null;
      int var2;
      if (this.c8 != 0) {
         var1 = this.u9;
         var2 = this.c8;
      } else {
         var1 = this.a6;
         var2 = this.h0;
      }

      while (true) {
         switch (((c8)((Object[])var1)[var2]).n5()) {
            case 0:
            case 1:
            case 7:
               return ((c8)((Object[])var1)[var2]).h0();
            default:
               c8[][] var3 = new c8[][]{(c8[])var1};
               var2 = var3[0][var2].l6(var3);
               var1 = var3[0];
               if (var2 == 0) {
                  return d1.n5;
               }
         }
      }
   }

   @Override
   public boolean s7() {
      return this.a6[this.h0].k7();
   }

   @Override
   public z9 l6() {
      return this.a6[this.h0].u9().n5();
   }

   @Override
   public boolean e2() {
      c8[] var1 = this.a6;
      int var2 = this.h0;
      c8[][] var3 = new c8[][]{this.a6};
      int[] var4 = new int[]{this.h0};
      boolean var5 = com.aspose.slides.internal.o8x.t2.n5(var3, var4);
      this.a6 = var3[0];
      this.h0 = var4[0];
      if (var5) {
         this.u9 = var1;
         this.c8 = var2;
         return true;
      } else {
         return false;
      }
   }

   @Override
   public boolean t9() {
      c8[][] var1 = new c8[][]{this.a6};
      int[] var2 = new int[]{this.h0};
      boolean var3 = com.aspose.slides.internal.o8x.t2.l6(var1, var2);
      this.a6 = var1[0];
      this.h0 = var2[0];
      return var3;
   }

   @Override
   public boolean y4() {
      return this.a6[this.h0].t9();
   }

   @Override
   public boolean l6(String var1, String var2) {
      c8[] var3 = this.a6;
      int var4 = this.h0;
      if (var1 != this.t2) {
         this.t2 = var1 != null ? this.l6().l6(var1) : null;
      }

      c8[][] var5 = new c8[][]{this.a6};
      int[] var6 = new int[]{this.h0};
      boolean var7 = com.aspose.slides.internal.o8x.t2.k5(var5, var6, this.t2, var2);
      this.a6 = var5[0];
      this.h0 = var6[0];
      if (var7) {
         this.u9 = var3;
         this.c8 = var4;
         return true;
      } else {
         return false;
      }
   }

   @Override
   public boolean l6(int var1) {
      Object var2 = null;
      int var4;
      if (var1 == 2) {
         c8[][] var3 = new c8[][]{(c8[])var2};
         var4 = com.aspose.slides.internal.o8x.t2.n5(this.a6, this.h0, var3);
         var2 = var3[0];
      } else {
         c8[][] var6 = new c8[][]{(c8[])var2};
         var4 = com.aspose.slides.internal.o8x.t2.l6(this.a6, this.h0, var6);
         var2 = var6[0];
      }

      while (var4 != 0) {
         if (var1 != 1 || !((c8)((Object[])var2)[var4]).n3()) {
            this.u9 = this.a6;
            this.c8 = this.h0;
            this.a6 = (c8[])var2;
            this.h0 = var4;
            return true;
         }

         c8[][] var7 = new c8[][]{(c8[])var2};
         var4 = var7[0][var4].k5(var7);
         var2 = var7[0];
      }

      return false;
   }

   @Override
   public boolean k5(int var1) {
      c8[] var2 = this.a6;
      Object var3 = null;
      int var4 = this.h0;
      if (var2[var4].n5() != 3) {
         return false;
      }

      while (true) {
         c8[][] var5 = new c8[][]{var2};
         var4 = var5[0][var4].k5(var5);
         var2 = var5[0];
         if (var4 == 0) {
            return false;
         }

         switch (var1) {
            case 1:
               if (var2[var4].n3()) {
                  continue;
               }
               break;
            case 2:
               c8[][] var6 = new c8[][]{(c8[])var3};
               int var7 = var2[var4].l6(var6);
               var3 = var6[0];
               if (var7 != this.c8 || var3 != this.u9) {
                  return false;
               }
         }

         this.a6 = var2;
         this.h0 = var4;
         return true;
      }
   }

   @Override
   public boolean z1() {
      c8[][] var1 = new c8[][]{this.a6};
      int[] var2 = new int[]{this.h0};
      boolean var3 = com.aspose.slides.internal.o8x.t2.u3(var1, var2);
      this.a6 = var1[0];
      this.h0 = var2[0];
      return var3;
   }

   @Override
   public boolean t4() {
      if (this.a6[this.h0].e2()) {
         this.u9 = this.a6;
         this.c8 = this.h0;
         c8[][] var4 = new c8[][]{this.a6};
         this.h0 = var4[0][this.h0].u9().n5(var4);
         this.a6 = var4[0];
         return true;
      } else {
         c8[][] var1 = new c8[][]{this.a6};
         int[] var2 = new int[]{this.h0};
         boolean var3 = com.aspose.slides.internal.o8x.t2.k5(var1, var2);
         this.a6 = var1[0];
         this.h0 = var2[0];
         return var3;
      }
   }

   @Override
   public boolean q0() {
      if (this.c8 != 0) {
         this.a6 = this.u9;
         this.h0 = this.c8;
         this.u9 = null;
         this.c8 = 0;
         return true;
      } else {
         c8[][] var1 = new c8[][]{this.a6};
         int[] var2 = new int[]{this.h0};
         boolean var3 = com.aspose.slides.internal.o8x.t2.a6(var1, var2);
         this.a6 = var1[0];
         this.h0 = var2[0];
         return var3;
      }
   }

   @Override
   public boolean n5(com.aspose.slides.internal.x6s.a6 var1) {
      h0 var2 = com.aspose.slides.internal.v6g.k5.n5(var1, h0.class);
      if (var2 != null) {
         this.a6 = var2.a6;
         this.h0 = var2.h0;
         this.u9 = var2.u9;
         this.c8 = var2.c8;
         return true;
      } else {
         return false;
      }
   }

   @Override
   public boolean u3(String var1) {
      Object var2 = null;
      c8[][] var3 = new c8[][]{(c8[])var2};
      int var4 = this.a6[this.h0].u9().n5(var1, var3);
      var2 = var3[0];
      if (var4 != 0) {
         this.a6 = (c8[])var2;
         this.h0 = var4;
         this.u9 = null;
         this.c8 = 0;
         return true;
      } else {
         return false;
      }
   }

   @Override
   public boolean l6(com.aspose.slides.internal.x6s.a6 var1) {
      h0 var2 = com.aspose.slides.internal.v6g.k5.n5(var1, h0.class);
      return var2 == null ? false : this.h0 == var2.h0 && this.a6 == var2.a6 && this.c8 == var2.c8 && this.u9 == var2.u9;
   }

   @Override
   public boolean m1() {
      return this.a6[this.h0].z1();
   }

   @Override
   public void z3() {
      if (this.c8 != 0) {
         this.u9 = null;
         this.c8 = 0;
      }

      c8[][] var1 = new c8[][]{this.a6};
      this.h0 = var1[0][this.h0].n5(var1);
      this.a6 = var1[0];
   }

   @Override
   public boolean k5(String var1, String var2) {
      if (var1 != this.t2) {
         this.t2 = var1 != null ? this.l6().l6(var1) : null;
      }

      c8[][] var3 = new c8[][]{this.a6};
      int[] var4 = new int[]{this.h0};
      boolean var5 = com.aspose.slides.internal.o8x.t2.n5(var3, var4, this.t2, var2);
      this.a6 = var3[0];
      this.h0 = var4[0];
      return var5;
   }

   @Override
   public boolean u3(String var1, String var2) {
      if (var1 != this.t2) {
         this.t2 = var1 != null ? this.l6().l6(var1) : null;
      }

      c8[][] var3 = new c8[][]{this.a6};
      int[] var4 = new int[]{this.h0};
      boolean var5 = com.aspose.slides.internal.o8x.t2.l6(var3, var4, this.t2, var2);
      this.a6 = var3[0];
      this.h0 = var4[0];
      return var5;
   }

   @Override
   public boolean u3(int var1) {
      if (this.a6[this.h0].e2()) {
         if (var1 != 4 && var1 != 9) {
            return false;
         }

         this.u9 = this.a6;
         this.c8 = this.h0;
         c8[][] var5 = new c8[][]{this.a6};
         this.h0 = var5[0][this.h0].u9().n5(var5);
         this.a6 = var5[0];
         return true;
      } else {
         c8[][] var2 = new c8[][]{this.a6};
         int[] var3 = new int[]{this.h0};
         boolean var4 = com.aspose.slides.internal.o8x.t2.n5(var2, var3, var1);
         this.a6 = var2[0];
         this.h0 = var3[0];
         return var4;
      }
   }

   @Override
   public boolean a6(int var1) {
      c8[][] var2 = new c8[][]{this.a6};
      int[] var3 = new int[]{this.h0};
      boolean var4 = com.aspose.slides.internal.o8x.t2.l6(var2, var3, var1);
      this.a6 = var2[0];
      this.h0 = var3[0];
      return var4;
   }

   @Override
   public boolean n5(String var1, String var2, com.aspose.slides.internal.x6s.a6 var3) {
      c8[] var4 = null;
      if (var1 != this.t2) {
         this.t2 = var1 != null ? this.l6().l6(var1) : null;
      }

      c8[][] var5 = new c8[][]{var4};
      int var6 = this.n5(com.aspose.slides.internal.v6g.k5.n5(var3, h0.class), false, var5);
      var4 = var5[0];
      if (this.c8 != 0) {
         c8[][] var11 = new c8[][]{this.u9};
         int[] var12 = new int[]{this.c8};
         boolean var13 = !com.aspose.slides.internal.o8x.t2.n5(var11, var12, var4, var6, this.t2, var2);
         this.u9 = var11[0];
         this.c8 = var12[0];
         if (var13) {
            return false;
         }

         this.a6 = this.u9;
         this.h0 = this.c8;
         this.u9 = null;
         this.c8 = 0;
         return true;
      } else {
         c8[][] var7 = new c8[][]{this.a6};
         int[] var8 = new int[]{this.h0};
         boolean var9 = com.aspose.slides.internal.o8x.t2.n5(var7, var8, var4, var6, this.t2, var2);
         this.a6 = var7[0];
         this.h0 = var8[0];
         return var9;
      }
   }

   @Override
   public boolean n5(int var1, com.aspose.slides.internal.x6s.a6 var2) {
      h0 var3 = com.aspose.slides.internal.v6g.k5.n5(var2, h0.class);
      c8[] var4 = null;
      if (var1 == 4 || var1 == 9) {
         if (this.a6[this.h0].e2()) {
            if (var3 != null && this.h0 == var3.c8 && this.a6 == var3.u9) {
               return false;
            }

            this.u9 = this.a6;
            this.c8 = this.h0;
            c8[][] var16 = new c8[][]{this.a6};
            this.h0 = var16[0][this.h0].u9().n5(var16);
            this.a6 = var16[0];
            return true;
         }

         if (var1 == 4) {
            c8[][] var15 = new c8[][]{var4};
            int var17 = this.n5(var3, true, var15);
            var4 = var15[0];
            c8[] var7;
            int var8;
            if (this.c8 != 0) {
               var7 = this.u9;
               var8 = this.c8;
            } else {
               var7 = this.a6;
               var8 = this.h0;
            }

            if (var3 != null && var3.c8 != 0 && var8 == var17 && var7 == var4) {
               return false;
            }

            c8[][] var21 = new c8[][]{var7};
            int[] var23 = new int[]{var8};
            boolean var25 = !com.aspose.slides.internal.o8x.t2.n5(var21, var23, var4, var17);
            var7 = var21[0];
            var8 = var23[0];
            if (var25) {
               return false;
            }

            if (var7[var8].n5() == 1) {
               c8[][] var12 = new c8[][]{this.a6};
               this.h0 = var7[var8].u9().n5(var12);
               this.a6 = var12[0];
               this.u9 = var7;
               this.c8 = var8;
            } else {
               this.a6 = var7;
               this.h0 = var8;
               this.u9 = null;
               this.c8 = 0;
            }

            return true;
         }
      }

      c8[][] var5 = new c8[][]{var4};
      int var6 = this.n5(var3, false, var5);
      var4 = var5[0];
      if (this.c8 != 0) {
         c8[][] var20 = new c8[][]{this.u9};
         int[] var22 = new int[]{this.c8};
         boolean var24 = !com.aspose.slides.internal.o8x.t2.n5(var20, var22, var4, var6, var1);
         this.u9 = var20[0];
         this.c8 = var22[0];
         if (var24) {
            return false;
         }

         this.a6 = this.u9;
         this.h0 = this.c8;
         this.u9 = null;
         this.c8 = 0;
         return true;
      } else {
         c8[][] var9 = new c8[][]{this.a6};
         int[] var10 = new int[]{this.h0};
         boolean var11 = com.aspose.slides.internal.o8x.t2.n5(var9, var10, var4, var6, var1);
         this.a6 = var9[0];
         this.h0 = var10[0];
         return var11;
      }
   }

   @Override
   public com.aspose.slides.internal.x6s.h0 u9(int var1) {
      return new a6(this, var1);
   }

   @Override
   public com.aspose.slides.internal.x6s.h0 a6(String var1, String var2) {
      return var1 != null && var1.length() != 0 ? new k5(this, var1, var2) : super.a6(var1, var2);
   }

   @Override
   public com.aspose.slides.internal.x6s.h0 n5(int var1, boolean var2) {
      return new u9(this, var1, var2);
   }

   @Override
   public com.aspose.slides.internal.x6s.h0 n5(String var1, String var2, boolean var3) {
      return var1 != null && var1.length() != 0 ? new u3(this, var1, var2, var3) : super.n5(var1, var2, var3);
   }

   @Override
   public int u3(com.aspose.slides.internal.x6s.a6 var1) {
      h0 var2 = com.aspose.slides.internal.v6g.k5.n5(var1, h0.class);
      if (var2 != null) {
         com.aspose.slides.internal.x6s.l6 var3 = this.a6[this.h0].u9();
         com.aspose.slides.internal.x6s.l6 var4 = var2.a6[var2.h0].u9();
         if (var3 == var4) {
            int var5 = this.y1();
            int var6 = var2.y1();
            if (var5 == var6) {
               var5 = this.a0();
               var6 = var2.a0();
               if (var5 == var6) {
                  return 2;
               }
            }

            return var5 < var6 ? 0 : 1;
         }
      }

      return 3;
   }

   @Override
   public boolean k5(com.aspose.slides.internal.x6s.a6 var1) {
      h0 var2 = com.aspose.slides.internal.v6g.k5.n5(var1, h0.class);
      if (var2 != null) {
         Object var3 = null;
         int var4;
         if (var2.c8 != 0) {
            var3 = var2.u9;
            var4 = var2.c8;
         } else {
            c8[][] var5 = new c8[][]{(c8[])var3};
            var4 = var2.a6[var2.h0].l6(var5);
            var3 = var5[0];
         }

         while (var4 != 0) {
            if (var4 == this.h0 && var3 == this.a6) {
               return true;
            }

            c8[][] var7 = new c8[][]{(c8[])var3};
            var4 = var7[0][var4].l6(var7);
            var3 = var7[0];
         }
      }

      return false;
   }

   private int y1() {
      return this.c8 == 0 ? com.aspose.slides.internal.o8x.t2.n5(this.a6, this.h0) : com.aspose.slides.internal.o8x.t2.n5(this.u9, this.c8);
   }

   private int a0() {
      if (this.c8 == 0) {
         return Integer.MIN_VALUE;
      }

      switch (this.a6[this.h0].n5()) {
         case 2:
            return com.aspose.slides.internal.o8x.t2.n5(this.a6, this.h0);
         case 3:
            return -2147483647 + com.aspose.slides.internal.o8x.t2.n5(this.a6, this.h0);
         default:
            return Integer.MAX_VALUE;
      }
   }

   @Override
   public String c4() {
      char[] var1 = new char[16];
      int var2 = 0;
      var1[var2++] = l6[this.a6[this.h0].n5()];
      if (this.c8 != 0) {
         int var3 = this.u9[0].x8().n5() - 1 << 16 | this.c8 - 1;

         do {
            var1[var2++] = k5[var3 & 31];
            var3 >>= 5;
         } while (var3 != 0);

         var1[var2++] = '0';
      }

      int var5 = this.a6[0].x8().n5() - 1 << 16 | this.h0 - 1;

      do {
         var1[var2++] = k5[var5 & 31];
         var5 >>= 5;
      } while (var5 != 0);

      return d1.n5(var1, 0, var2);
   }

   @Override
   public Object n3() {
      return this.n5();
   }

   @Override
   public final boolean ag_() {
      return this.a6[this.h0].u9().l6();
   }

   @Override
   public final int ah_() {
      return this.c8 != 0 && this.k5() == 4 ? this.u9[this.c8].c8() : this.a6[this.h0].c8();
   }

   @Override
   public final int ai_() {
      return this.c8 != 0 && this.k5() == 4 ? this.u9[this.c8].s7() : this.a6[this.h0].t2();
   }

   public final int y2() {
      return this.h0 ^ this.c8;
   }

   public final boolean u9(String var1, String var2) {
      if (var1 != this.t2) {
         this.t2 = var1 != null ? this.l6().l6(var1) : null;
      }

      return this.c8 != 0 ? false : this.a6[this.h0].l6(this.t2, var2);
   }

   public final boolean s7(int var1) {
      return (1 << this.a6[this.h0].n5() & c8(var1)) != 0;
   }

   private int n5(h0 var1, boolean var2, c8[][] var3) {
      if (var1 == null || this.a6[this.h0].u9() != var1.a6[var1.h0].u9()) {
         var3[0] = null;
         return 0;
      } else if (var1.c8 == 0) {
         var3[0] = var1.a6;
         return var1.h0;
      } else {
         var3[0] = var1.u9;
         return var2 ? var1.c8 : var1.c8 + 1;
      }
   }

   // $VF: synthetic method
   @Override

   // Restored from the original synthetic/bridge forwarding bytecode.
   public com.aspose.slides.internal.x6s.a6 deepClone() {
      return this.n5();
   }

}
