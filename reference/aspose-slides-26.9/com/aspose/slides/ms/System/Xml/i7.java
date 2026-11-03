package com.aspose.slides.ms.System.Xml;

import com.aspose.slides.exceptions.ArgumentOutOfRangeException;
import com.aspose.slides.exceptions.InvalidOperationException;

public class i7 extends c7 implements f0 {
   private c7 n5;
   private z9 l6;
   private k8[] k5;
   private k8[] u3;
   private k8 a6;
   private int u9;
   private int h0;
   private int c8;
   private boolean t2;
   private t2 s7;
   private int x8;
   private int n3;
   private boolean y4;
   private f0 e2;
   private k8 t9;

   public i7(c7 var1, f0 var2, t2 var3) {
      this.n5 = var1;
      this.e2 = var2;
      this.s7 = var3;
      this.u3 = new k8[8];
      this.k5 = new k8[4];
      this.t1();
   }

   private void t1() {
      this.l6 = this.n5.y1();
      this.u9 = 1;
      this.h0 = 0;
      this.x8 = -1;
      this.n3 = -1;
      this.c8 = 0;
      this.a6 = null;
      this.y4 = false;
      if (this.n5.s7() == 1) {
         k8 var1 = this.u9(this.n5.s7());
         var1.n5(this.n5.n3(), this.n5.e2(), this.n5.y4(), this.n5.t4());
         var1.n5(this.e2);
         this.h2();
      }
   }

   public final void l6(c7 var1) {
      this.n5 = var1;
      this.t1();
   }

   @Override
   public w4 n5() {
      return this.n5.n5();
   }

   @Override
   public int s7() {
      return this.a6.h0();
   }

   @Override
   public String x8() {
      return this.a6.n5(this.l6);
   }

   @Override
   public String n3() {
      return this.a6.n5();
   }

   @Override
   public String y4() {
      return this.a6.l6();
   }

   @Override
   public String e2() {
      return this.a6.k5();
   }

   @Override
   public boolean t9() {
      return a6(this.a6.h0());
   }

   @Override
   public String z1() {
      return this.t2 ? this.a6.u9() : this.a6.a6();
   }

   @Override
   public int t4() {
      return this.a6.u3();
   }

   @Override
   public String q0() {
      return this.n5.q0();
   }

   @Override
   public boolean m1() {
      return false;
   }

   @Override
   public boolean l6() {
      return false;
   }

   @Override
   public char d5() {
      return this.n5.d5();
   }

   @Override
   public int k7() {
      return this.n5.k7();
   }

   @Override
   public int z8() {
      return this.c8;
   }

   @Override
   public String u3(String var1) {
      int var2;
      if (com.aspose.slides.ms.System.d1.u3(var1, ':') == -1) {
         var2 = this.l6(var1);
      } else {
         var2 = this.h0(var1);
      }

      return var2 >= 0 ? this.u3[var2].a6() : null;
   }

   @Override
   public String k5(int var1) {
      if (var1 >= 0 && var1 < this.c8) {
         return this.u3[var1].a6();
      } else {
         throw new ArgumentOutOfRangeException("i");
      }
   }

   @Override
   public boolean k5(String var1) {
      int var2;
      if (com.aspose.slides.ms.System.d1.u3(var1, ':') == -1) {
         var2 = this.l6(var1);
      } else {
         var2 = this.h0(var1);
      }

      if (var2 >= 0) {
         this.x8 = var2;
         this.a6 = this.u3[var2];
         return true;
      } else {
         return false;
      }
   }

   @Override
   public void l6(int var1) {
      if (var1 >= 0 && var1 < this.c8) {
         this.x8 = var1;
         this.a6 = this.u3[var1];
      } else {
         throw new ArgumentOutOfRangeException("i");
      }
   }

   @Override
   public boolean k5() {
      if (this.c8 == 0) {
         return false;
      }

      this.x8 = 0;
      this.a6 = this.u3[0];
      return true;
   }

   @Override
   public boolean u3() {
      if (this.x8 + 1 < this.c8) {
         this.a6 = this.u3[++this.x8];
         return true;
      } else {
         return false;
      }
   }

   @Override
   public boolean a6() {
      if (this.u9 == 3 && this.a6.h0() == 2) {
         this.n3 = 0;
         this.x8 = -1;
         this.u9();
         return true;
      } else {
         return false;
      }
   }

   @Override
   public boolean u9() {
      switch (this.u9) {
         case 1:
            this.u9 = 2;
            k8 var2 = null;
            if (this.n5.u9()) {
               switch (this.n5.s7()) {
                  case 1:
                     this.u9 = 4;
                     return false;
                  case 2:
                  case 5:
                  case 6:
                  case 9:
                  case 10:
                  case 11:
                  case 12:
                  default:
                     break;
                  case 3:
                  case 4:
                  case 7:
                  case 8:
                  case 13:
                  case 14:
                     var2 = this.u9(this.n5.s7());
                     var2.a6(this.n5.z1());
                     var2.n5(this.e2);
                     var2.n5(this.n5.t4());
                     break;
                  case 15:
                     var2 = this.u9(this.n5.s7());
                     var2.n5(this.n5.n3(), this.n5.e2(), this.n5.y4(), this.n5.t4());
                     var2.n5(this.e2);
               }

               this.a6 = var2;
               return true;
            }

            this.u9 = 4;
            return false;
         case 2:
            k8 var1 = null;
            if (this.n5.u9()) {
               switch (this.n5.s7()) {
                  case 1:
                     this.u9 = 4;
                     return false;
                  case 2:
                  case 5:
                  case 6:
                  case 9:
                  case 10:
                  case 11:
                  case 12:
                  default:
                     break;
                  case 3:
                  case 4:
                  case 7:
                  case 8:
                  case 13:
                  case 14:
                     var1 = this.u9(this.n5.s7());
                     var1.a6(this.n5.z1());
                     var1.n5(this.e2);
                     var1.n5(this.n5.t4());
                     break;
                  case 15:
                     var1 = this.u9(this.n5.s7());
                     var1.n5(this.n5.n3(), this.n5.e2(), this.n5.y4(), this.n5.t4());
                     var1.n5(this.e2);
               }

               this.a6 = var1;
               return true;
            }

            this.u9 = 4;
            return false;
         case 3:
            if (this.n3 >= this.h0) {
               this.u9 = 4;
               this.s7.n5(this);
               if (this.n5.s7() == 1 && !this.y4) {
                  return true;
               }

               return this.n5.u9();
            }

            this.a6 = this.k5[this.n3];
            if (this.n3 > 0) {
               this.a5();
            }

            this.n3++;
            return true;
         default:
            return false;
      }
   }

   public final k8 n5(String var1, String var2, int var3, int var4, int var5) {
      k8 var6 = this.u9(3);
      var6.n5(var1, var2);
      var6.n5(var4, var5);
      var6.n5(var3);
      return var6;
   }

   public final void l6(String var1, String var2) {
      k8 var3 = this.n5(var1, var2, this.n5.t4() + 1, 0, 0);
      int var4 = this.h0 - 2;
      k8 var5 = this.k5[var4];
      this.k5[var4] = var3;
      this.k5[this.h0 - 1] = var5;
   }

   public final void t2() {
      k8 var1 = this.u9(15);
      var1.n5(this.n5.n3(), this.n5.e2(), this.n5.y4(), this.n5.t4());
      var1.n5(com.aspose.slides.internal.v6g.k5.n5(this.n5, f0.class));
      if (this.n5.m1()) {
         this.y4 = true;
      }
   }

   @Override
   public boolean j5() {
      return this.u9 == 4 && this.n5.j5();
   }

   @Override
   public void w1() {
      this.n5.w1();
      this.u9 = 4;
   }

   @Override
   public int h0() {
      return this.n5.h0();
   }

   @Override
   public void r4() {
      switch (this.a6.h0()) {
         case 1:
            if (this.n5.s7() != 15 && !this.y4) {
               int var2 = this.n5.t4() - 1;

               while (this.n5.u9() && this.n5.t4() > var2) {
               }
            }

            this.n5.u9();
            this.u9 = 4;
            this.s7.n5(this);
            break;
         case 2:
            this.a6();
            if (this.n5.s7() != 15 && !this.y4) {
               int var1 = this.n5.t4() - 1;

               while (this.n5.u9() && this.n5.t4() > var1) {
               }
            }

            this.n5.u9();
            this.u9 = 4;
            this.s7.n5(this);
            break;
         default:
            this.u9();
      }
   }

   @Override
   public z9 y1() {
      return this.l6;
   }

   @Override
   public String n5(String var1) {
      return this.n5.n5(var1);
   }

   @Override
   public void a0() {
      throw new InvalidOperationException();
   }

   @Override
   public boolean c8() {
      if (this.a6.h0() != 2) {
         return false;
      }

      this.a6 = this.n5(this.a6.a6(), this.a6.u3() + 1);
      return true;
   }

   @Override
   public final boolean ag_() {
      return true;
   }

   @Override
   public final int ah_() {
      return this.a6.t2();
   }

   @Override
   public final int ai_() {
      return this.a6.s7();
   }

   public final void z7() {
      this.u9 = 3;
      this.n3 = 0;
      this.x8 = -1;
      this.u9();
   }

   public final c7 v4() {
      return this.n5;
   }

   public final f0 u6() {
      return this.e2;
   }

   private void a5() {
      this.c8 = 0;
      this.x8 = -1;
   }

   private k8 n5(int var1) {
      k8 var2 = this.u3[var1];
      if (var2 != null) {
         var2.k5(2);
         return var2;
      }

      if (var1 >= this.u3.length - 1) {
         k8[] var3 = new k8[this.u3.length * 2];
         com.aspose.slides.ms.System.u3.n5(com.aspose.slides.ms.System.u3.n5((Object)(this.u3)), 0, com.aspose.slides.ms.System.u3.n5((Object)(var3)), 0, this.u3.length);
         this.u3 = var3;
      }

      var2 = this.u3[var1];
      if (var2 == null) {
         var2 = new k8(2);
         this.u3[var1] = var2;
      }

      return var2;
   }

   private k8 u9(int var1) {
      k8 var2 = this.k5[this.h0];
      if (var2 != null) {
         var2.k5(var1);
         this.h0++;
         return var2;
      }

      if (this.h0 >= this.k5.length - 1) {
         k8[] var3 = new k8[this.k5.length * 2];
         com.aspose.slides.ms.System.u3.n5(com.aspose.slides.ms.System.u3.n5((Object)(this.k5)), 0, com.aspose.slides.ms.System.u3.n5((Object)(var3)), 0, this.k5.length);
         this.k5 = var3;
      }

      var2 = this.k5[this.h0];
      if (var2 == null) {
         var2 = new k8(var1);
         this.k5[this.h0] = var2;
      }

      this.h0++;
      return var2;
   }

   private void h2() {
      this.c8 = this.n5.z8();
      if (this.n5.k5()) {
         int var1 = 0;

         do {
            k8 var2 = this.n5(var1);
            var2.n5(this.n5.n3(), this.n5.e2(), this.n5.y4(), this.n5.t4());
            var2.n5(this.e2);
            var2.u3(this.n5.z1());
            var1++;
         } while (this.n5.u3());

         this.n5.a6();
      }
   }

   private int l6(String var1) {
      var1 = this.l6.l6(var1);
      if (var1 == null) {
         return -1;
      }

      for (int var2 = 0; var2 < this.c8; var2++) {
         k8 var3 = this.u3[var2];
         if (v8.n5(var3.n5(), var1) && var3.k5().length() == 0) {
            return var2;
         }
      }

      return -1;
   }

   private int h0(String var1) {
      var1 = this.l6.l6(var1);
      if (var1 == null) {
         return -1;
      }

      for (int var2 = 0; var2 < this.c8; var2++) {
         k8 var3 = this.u3[var2];
         if (v8.n5(var3.n5(this.l6), var1)) {
            return var2;
         }
      }

      return -1;
   }

   private k8 n5(String var1, int var2) {
      if (this.t9 == null) {
         this.t9 = new k8(3);
      }

      this.t9.n5(var2);
      this.t9.u3(var1);
      return this.t9;
   }
}
