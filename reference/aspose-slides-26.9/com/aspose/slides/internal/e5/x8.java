package com.aspose.slides.internal.e5;

import com.aspose.slides.Collections.Generic.Dictionary;
import com.aspose.slides.Collections.Generic.Stack;
import com.aspose.slides.exceptions.IndexOutOfRangeException;
import com.aspose.slides.internal.h2.a5;
import com.aspose.slides.internal.h2.f0;
import com.aspose.slides.ms.System.d1;

public class x8 extends t2 implements com.aspose.slides.internal.r4.a6 {
   public com.aspose.slides.internal.r4.n5 u3;
   private com.aspose.slides.internal.h2.s7 a6;
   private com.aspose.slides.internal.h2.x8 u9;
   private com.aspose.slides.internal.o9b.c8 h0 = new com.aspose.slides.internal.o9b.c8();
   private com.aspose.slides.internal.h2.f2 c8;
   private a5 t2;
   private f0 s7;
   private int x8;
   private int n3;
   private int y4;
   private a5 e2;
   private int t9;
   private com.aspose.slides.internal.f2.k5 z1;
   private com.aspose.slides.internal.f2.k5 t4;
   private String q0;
   private String z3;
   private String m1;
   private int k7;
   private int m3;
   private x8 z8 = null;
   private com.aspose.slides.internal.v4.h0 j5 = null;
   private com.aspose.slides.internal.h2.z1 w1;
   private com.aspose.slides.internal.c4.n5 r4;
   private int[] c4;
   private Dictionary<x8$n5, String> y2;

   public x8(t2 var1) {
      super(var1);
   }

   public final void a6(String var1) {
      int var2 = var1.length() < 16 ? 16 : var1.length();
      this.u3 = com.aspose.slides.internal.r4.n5.n5(var2);
      this.u3.a6(this.u3.l6());
      this.u3.n5(d1.c8(var1), 0, var1.length());
      this.u3.a6(this.u3.n5());
   }

   @Override
   public void l6(char[] var1, int var2, int var3, w1 var4, com.aspose.slides.internal.w2.u9 var5) {
      if (this.u3 == null) {
         int var6 = var3 < 16 ? 16 : var3;
         this.u3 = com.aspose.slides.internal.r4.n5.n5(var6);
      } else {
         int var10 = this.u3.n5() + var3;
         int var7 = this.u3.l6();
         if (var10 > var7) {
            int var8 = var7 * 2;
            if (var10 > var8) {
               var8 = var10;
            }

            com.aspose.slides.internal.r4.n5 var9 = com.aspose.slides.internal.r4.n5.n5(var8);
            this.u3.k5();
            var9.n5(this.u3);
            this.u3 = var9;
         }
      }

      this.u3.a6(this.u3.l6());
      this.u3.n5(var1, var2, var3);
      this.u3.a6(this.u3.n5());
   }

   public final com.aspose.slides.internal.r4.a6 j5() {
      if (this.u3 == null) {
         return null;
      }

      this.u3.k5();
      return this.u3.n5(0, this.u3.c8());
   }

   @Override
   public t2 n5(t2 var1, boolean var2) {
      x8 var3 = (x8)super.n5(var1, var2);
      if (var2 && this.u3 != null) {
         var3.u3 = com.aspose.slides.internal.r4.n5.n5(this.u3.c8());
         this.u3.k5();
         var3.u3.n5(this.u3);
         var3.u3.k5();
      }

      var3.z8 = null;
      var3.j5 = null;
      return var3;
   }

   @Override
   public void n5(w1 var1) {
      this.a6 = var1.x8();
      this.u9 = var1.u9();
      var1.u3(72).n5(this.q_()).n5(this.h0);
      this.c8 = var1.u3(131).y4();
      this.s7 = var1.u3(144).z1();
      this.t2 = var1.u3(141);
      this.n3 = var1.u3(261).a6();
      this.x8 = var1.u3(262).a6();
      this.y4 = var1.u3(252).a6();
      this.e2 = var1.u3(265);
      this.t9 = var1.u3(266).a6();
      this.w1 = var1.n3();
      this.z1 = var1.u3(15).c8();
      this.q0 = var1.u3(81).j_();
      this.z3 = var1.u3(134).j_();
      this.m1 = var1.u3(218).j_();
      this.t4 = var1.u3(264).c8();
      this.k7 = var1.u3(245).a6();
      this.m3 = var1.u3(260).a6();
   }

   @Override
   public void c8() {
      if (this.u3 != null) {
         this.u3.k5();
      }

      super.c8();
      this.n_().n5(this);
   }

   @Override
   public void r_() {
      this.v4();
   }

   public final boolean w1() {
      if (this.n3 == 48 && this.u3.c8() > 0) {
         return true;
      }

      this.u3.k5();

      while (this.u3.s7()) {
         char var1 = this.u3.u3();
         if (var1 != ' ' && var1 != '\n' && var1 != '\r' && var1 != '\t') {
            this.u3.k5();
            return true;
         }
      }

      return false;
   }

   @Override
   public k5 n3() {
      return new x8$l6(this);
   }

   public final void n5(com.aspose.slides.internal.v4.h0 var1) {
      this.j5 = var1;
      if (var1.h0 != null) {
         if (var1.h0.j5 == this.j5) {
            this.z8 = var1.h0;
         } else {
            this.z8 = null;
         }
      }
   }

   private void v4() {
      if (!this.o_().u3() && this.y4 != 95) {
         this.u3.k5();
         int var1 = this.u3.c8();
         int var2 = -1;

         while (++var2 < var1) {
            char var3 = this.u3.u3();
            this.u3.a6();
            switch (this.y4) {
               case 22:
                  if (this.k5(var2)) {
                     com.aspose.slides.internal.x7n.l6 var4 = new com.aspose.slides.internal.x7n.l6("en-US", false);

                     try {
                        if (this.z3 != null) {
                           if (this.q0 != null) {
                              var4 = new com.aspose.slides.internal.x7n.l6(d1.n5(new String[]{this.z3, "-", this.q0}));
                           } else {
                              var4 = new com.aspose.slides.internal.x7n.l6(this.z3);
                           }
                        }
                     } catch (RuntimeException var6) {
                     }

                     com.aspose.slides.internal.x7n.e2 var5 = var4.n3();
                     this.u3.n5(d1.c8(com.aspose.slides.ms.System.t9.q0(var5.k5(var3)))[0]);
                  } else {
                     this.u3.n5(var3);
                  }
                  break;
               case 78:
                  this.u3.n5(com.aspose.slides.ms.System.t9.z1(var3));
                  break;
               case 155:
                  this.u3.n5(com.aspose.slides.ms.System.t9.z3(var3));
            }
         }
      }
   }

   private boolean k5(int var1) {
      char var2 = this.h0(var1, -1);
      switch (n5(var2)) {
         case 0:
            return true;
         case 1:
            return false;
         case 2:
            char var3 = this.h0(var1, -2);
            switch (n5(var3)) {
               case 0:
                  return true;
               case 1:
                  return false;
               case 2:
                  return true;
               default:
                  return false;
            }
         default:
            return false;
      }
   }

   private char h0(int var1, int var2) {
      int var3 = var1 + var2;
      if (var3 >= 0 && var3 < this.h0()) {
         return this.u3(var1 + var2);
      }

      if (var2 > 0) {
         return '\u0000';
      }

      boolean var4 = false;
      char var5 = 0;
      x8 var6 = this;
      int var7 = var2 + var1;

      while (!var4 && var6.z8 != null) {
         var6 = var6.z8;
         int var8 = var6.h0() + var7 - 1;
         if (var8 >= 0) {
            var5 = var6.u3(var8);
            var4 = true;
         } else {
            var7 += var8;
         }
      }

      return var5;
   }

   private static int n5(char var0) {
      switch (com.aspose.slides.ms.System.t9.l6(var0)) {
         case 0:
            return 1;
         case 1:
            return 1;
         case 2:
            return 1;
         case 3:
            return 1;
         case 4:
            return 1;
         case 5:
            return 1;
         case 6:
            return 1;
         case 7:
            return 0;
         case 8:
            return 1;
         case 9:
            return 1;
         case 10:
            return 1;
         case 11:
            return 0;
         case 12:
            return 0;
         case 13:
            return 0;
         case 14:
            return 0;
         case 15:
            return 0;
         case 16:
            return 0;
         case 17:
            return 0;
         case 18:
            return 1;
         case 19:
            if (var0 == '-') {
               return 1;
            }

            return 0;
         case 20:
            return 0;
         case 21:
            if (var0 == 8217) {
               return 2;
            }

            return 0;
         case 22:
         case 23:
         default:
            return 0;
         case 24:
            if (var0 == '\'') {
               return 2;
            }

            return 0;
         case 25:
            return 0;
         case 26:
            return 1;
         case 27:
            return 1;
         case 28:
            return 1;
         case 29:
            return 0;
      }
   }

   public final com.aspose.slides.internal.h2.s7 r4() {
      return this.a6;
   }

   public final com.aspose.slides.internal.h2.x8 c4() {
      return this.u9;
   }

   public final com.aspose.slides.internal.o9b.c8 y2() {
      return this.h0;
   }

   public final com.aspose.slides.internal.h2.f2 y1() {
      return this.c8;
   }

   public final a5 a0() {
      return this.t2;
   }

   public final int d2() {
      return this.x8;
   }

   public final a5 d5() {
      return this.e2;
   }

   public final com.aspose.slides.internal.h2.z1 s3() {
      return this.w1;
   }

   public final com.aspose.slides.internal.f2.k5 p8() {
      return this.t4;
   }

   public final int f2() {
      return this.k7;
   }

   public final int i1() {
      return this.m3;
   }

   public final String e5() {
      return this.z3;
   }

   public final String b3() {
      return this.m1;
   }

   @Override
   public String toString() {
      return d1.n5;
   }

   @Override
   public String z1() {
      return "#PCDATA";
   }

   @Override
   public String t4() {
      return null;
   }

   @Override
   public final char u3(int var1) {
      return this.u3.k5(var1);
   }

   public final com.aspose.slides.internal.r4.a6 n5(int var1, int var2) {
      return this.u3.n5(var1, var2);
   }

   @Override
   public final int h0() {
      return this.u3.c8();
   }

   public final void o0() {
      if (this.u3 != null) {
         this.u3.k5();
      }
   }

   @Override
   public boolean n5(int var1) {
      return false;
   }

   @Override
   public void n5(com.aspose.slides.internal.c4.n5 var1) {
      this.r4 = var1;
   }

   public final com.aspose.slides.internal.c4.n5 z7() {
      return this.r4;
   }

   public final void n5(int var1, int var2, int var3) {
      if (var2 < var3) {
         if (this.c4 == null) {
            this.c4 = new int[this.h0()];
         }

         for (int var4 = var2; var4 < var3; var4++) {
            this.c4[var4] = var1;
         }

         if (this.n5 != null) {
            ((t9)this.n5).u3(var1);
         }
      }
   }

   public final int[] l6(int var1, int var2) {
      if (this.c4 != null) {
         int var3 = var2 - var1;
         int[] var4 = new int[var3];
         System.arraycopy(this.c4, var1 + 0, var4, 0, var3);
         return var4;
      } else {
         return null;
      }
   }

   public final int l6(int var1) {
      if (var1 < 0 || var1 >= this.h0()) {
         throw new IndexOutOfRangeException();
      } else {
         return this.c4 != null ? this.c4[var1] : -1;
      }
   }

   public final void n5(int var1, int var2, com.aspose.slides.internal.r4.a6 var3) {
      if (this.y2 == null) {
         this.y2 = new Dictionary<>();
      }

      this.y2.addItem(new x8$n5(var1, var2), var3.toString());
   }

   public final boolean k5(int var1, int var2) {
      return this.y2 != null && this.y2.containsKey(new x8$n5(var1, var2));
   }

   public final String u3(int var1, int var2) {
      return this.y2 != null ? this.y2.get_Item(new x8$n5(var1, var2)) : null;
   }

   public final int a6(int var1, int var2) {
      return this.y2 != null ? this.y2.get_Item(new x8$n5(var1, var2)).length() : 0;
   }

   public final int[] u9(int var1, int var2) {
      if (!this.k5(var1, var2)) {
         return this.l6(var1, var2);
      }

      int var3 = var2 - var1;
      int var4 = this.a6(var1, var2);
      int[] var5 = this.l6(var1, var2);
      if (var5 == null) {
         return null;
      }

      if (var4 == var3) {
         return var5;
      }

      if (var4 <= var3) {
         int[] var10 = new int[var4];
         com.aspose.slides.ms.System.u3.n5(com.aspose.slides.ms.System.u3.n5((Object)(var5)), 0, com.aspose.slides.ms.System.u3.n5((Object)(var10)), 0, var10.length);
         return var10;
      }

      int[] var6 = new int[var4];
      com.aspose.slides.ms.System.u3.n5(com.aspose.slides.ms.System.u3.n5((Object)(var5)), 0, com.aspose.slides.ms.System.u3.n5((Object)(var6)), 0, var5.length);
      int var7 = var5.length;
      int var8 = var6.length;
      int var9 = var7 > 0 ? var5[var7 - 1] : 0;

      while (var7 < var8) {
         var6[var7] = var9;
         var7++;
      }

      return var6;
   }

   @Override
   protected Stack<com.aspose.slides.internal.d5.u3> n5(Stack<com.aspose.slides.internal.d5.u3> var1, com.aspose.slides.internal.d5.u3 var2) {
      if (var2 != null) {
         var2.n5(this.n3(), this);
      }

      return var1;
   }
}
