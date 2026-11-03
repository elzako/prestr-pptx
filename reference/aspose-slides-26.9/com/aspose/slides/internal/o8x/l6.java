package com.aspose.slides.internal.o8x;

import com.aspose.slides.Collections.Hashtable;
import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.Collections.Generic.Stack;
import com.aspose.slides.exceptions.NotImplementedException;
import com.aspose.slides.ms.System.IDisposable;
import com.aspose.slides.ms.System.d1;
import com.aspose.slides.ms.System.Xml.e5;
import com.aspose.slides.ms.System.Xml.f0;
import com.aspose.slides.ms.System.Xml.i1;
import com.aspose.slides.ms.System.Xml.k6;
import com.aspose.slides.ms.System.Xml.v9;
import com.aspose.slides.ms.System.Xml.z7;
import com.aspose.slides.ms.System.Xml.z9;

public final class l6 extends v9 {
   private l6$n5 n5 = new l6$n5();
   private l6$n5 l6 = new l6$n5();
   private l6$l6 k5 = new l6$l6();
   private Stack<y4> u3;
   private x8 a6;
   private com.aspose.slides.internal.x6s.l6 u9;
   private f0 h0;
   private z9 c8;
   private boolean t2;
   private c8[] s7;
   private int x8;
   private c8[] n3;
   private int y4;
   private c8[] e2;
   private int t9;
   private int z1;
   private int t4;
   private k6 q0;
   private Hashtable z3;
   private y4[] m1;

   public l6(com.aspose.slides.internal.x6s.l6 var1, f0 var2, String var3, int var4) {
      this.n5.n5(256);
      this.l6.n5(16);
      this.u3 = new Stack<>();
      this.n5(var1, var2, var3, var4);
   }

   public final void n5(com.aspose.slides.internal.x6s.l6 var1, f0 var2, String var3, int var4) {
      c8[] var5 = null;
      this.u9 = var1;
      this.c8 = var1.n5();
      this.t2 = (var4 & 1) != 0;
      this.t9 = 0;
      this.y4 = 0;
      this.m1 = (y4[])com.aspose.slides.ms.System.u3.n5(com.aspose.slides.ms.System.u3.n5(com.aspose.slides.internal.v6g.k5.n5(y4.class), 64));
      this.k5.n5(var2);
      this.h0 = var2;
      this.z1 = 0;
      this.t4 = 0;
      this.a6 = new x8();
      c8[][] var6 = new c8[][]{var5};
      int var7 = this.n5(var6, 4, d1.n5, d1.n5, d1.n5, d1.n5);
      var5 = var6[0];
      this.u9.n5(var5, var7);
      c8[][] var8 = new c8[][]{this.s7};
      this.x8 = this.n5(var8, this.c8.n5("xml"), this.c8.n5("http://www.w3.org/XML/1998/namespace"), null, 0);
      this.s7 = var8[0];
      this.u9.k5(this.s7, this.x8);
      if ((var4 & 2) == 0) {
         c8[][] var9 = new c8[][]{this.n3};
         this.y4 = this.n5(var9, 0, d1.n5, d1.n5, d1.n5, var3);
         this.n3 = var9[0];
         this.u9.l6(this.n3, this.y4);
      } else {
         this.u9.l6(this.n5.n5(), this.n5.l6());
      }
   }

   @Override
   public void n5(String var1, String var2, String var3, String var4) {
   }

   @Override
   public void n5(String var1, String var2, String var3) {
      this.u3(var1, var2, var3, d1.n5);
   }

   public final void u3(String var1, String var2, String var3, String var4) {
      if (this.t2) {
         var1 = this.c8.n5(var1);
         var2 = this.c8.n5(var2);
         var3 = this.c8.n5(var3);
      }

      this.n5(1, var2, var3, var1, var4);
      this.n3 = this.e2;
      this.y4 = this.t9;
      this.t9 = 0;
      int var5 = this.n3[this.y4].m3() & 63;
      this.n5(this.m1[var5].n5(), this.m1[var5].l6(), this.n3, this.y4).n5(this.m1[var5]);
      if (this.z3 != null) {
         this.q0 = (k6)this.z3.get_Item(new k6(var2, var1));
      }
   }

   @Override
   public void s7() {
      this.k5(true);
   }

   @Override
   public void x8() {
      this.k5(false);
   }

   @Override
   public void l6(String var1, String var2, String var3) {
      this.k5(true);
   }

   @Override
   public void k5(String var1, String var2, String var3) {
      this.k5(false);
   }

   public final void k5(boolean var1) {
      y4 var2 = new y4();
      if (!this.n3[this.y4].z1()) {
         switch (this.k5.n5()) {
            case 4:
               if (this.h0 != null) {
                  if (this.k5.k5() != this.n3[this.y4].c8()) {
                     this.h0();
                     this.n3[this.y4].n5(this.e2[this.t9].z8());
                     break;
                  }

                  int var3 = this.k5.u3() - this.n3[this.y4].t2();
                  if (var3 < 0 || var3 > 255) {
                     this.h0();
                     this.n3[this.y4].n5(this.e2[this.t9].z8());
                     break;
                  }

                  this.n3[this.y4].n5(var3);
               }

               this.n3[this.y4].l6(this.k5.a6());
               break;
            case 5:
            case 6:
               this.h0();
               this.n3[this.y4].n5(this.e2[this.t9].z8());
               break;
            default:
               this.n3[this.y4].l6(var1);
         }
      } else if (this.k5.l6()) {
         this.h0();
      }

      if (this.n3[this.y4].m1()) {
         this.u9.n5(this.n3, this.y4, this.s7, this.x8);
         this.u3.pop().n5(var2);
         this.s7 = var2.n5();
         this.x8 = var2.l6();
      }

      this.e2 = this.n3;
      this.t9 = this.y4;
      c8[][] var4 = new c8[][]{this.n3};
      this.y4 = var4[0][this.y4].l6(var4);
      this.n3 = var4[0];
   }

   @Override
   public void u3(String var1, String var2, String var3) {
      if (this.t2) {
         var1 = this.c8.n5(var1);
         var2 = this.c8.n5(var2);
         var3 = this.c8.n5(var3);
      }

      this.n5(2, var2, var3, var1, d1.n5);
   }

   @Override
   public void l6() {
      this.e2[this.t9].n5(this.k5.a6());
      if (this.q0 != null && d1.a6(this.e2[this.t9].k5(), this.q0.l6()) && d1.a6(this.e2[this.t9].l6(), this.q0.n5())) {
         this.u9.n5(this.e2[this.t9].z8(), this.n3, this.y4);
      }
   }

   @Override
   public void a6(String var1) {
      this.n5(var1, 4);
   }

   @Override
   public void u9(String var1) {
      this.n5(8, d1.n5, d1.n5, d1.n5, d1.n5);
      this.e2[this.t9].n5(var1);
   }

   @Override
   public void n5(String var1, String var2) {
      this.h0(var1, var2, d1.n5);
   }

   public final void h0(String var1, String var2, String var3) {
      if (this.t2) {
         var1 = this.c8.n5(var1);
      }

      this.n5(7, var1, d1.n5, d1.n5, var3);
      this.e2[this.t9].n5(var2);
   }

   @Override
   public void h0(String var1) {
      this.n5(var1, 6);
   }

   @Override
   public void l6(String var1) {
      this.n5(var1, 4);
   }

   @Override
   public void n5(char[] var1, int var2, int var3) {
      this.n5(d1.n5(var1, var2, var3), 4);
   }

   @Override
   public void c8(String var1) {
      this.n5(var1, 4);
   }

   @Override
   public void a_(char[] var1, int var2, int var3) {
      this.n5(d1.n5(var1, var2, var3), 4);
   }

   public final void n5(String var1, int var2) {
      this.k5.n5(var1, var2);
   }

   @Override
   public void k5(String var1) {
      throw new NotImplementedException();
   }

   @Override
   public void n5(char var1) {
      char[] var2 = new char[]{var1};
      this.n5(d1.n5(var2), 4);
   }

   @Override
   public void n5(char var1, char var2) {
      char[] var3 = new char[]{var2, var1};
      this.n5(d1.n5(var3), 4);
   }

   @Override
   public void a6() {
      Object var1 = null;
      if (this.k5.l6()) {
         this.h0();
      }

      c8[][] var2 = new c8[][]{(c8[])var1};
      int var3 = this.u9.l6(var2);
      var1 = var2[0];
      if (var3 == this.n5.l6() && var1 == this.n5.n5()) {
         this.n5(4, d1.n5, d1.n5, d1.n5, d1.n5);
         this.e2[this.t9].n5(d1.n5);
      }
   }

   @Override
   public void u9() {
   }

   @Override
   public void n5(int var1) {
   }

   @Override
   public void n5(String var1) {
   }

   @Override
   public void n5() {
   }

   @Override
   public void l6(String var1, String var2) {
      c8[] var3 = null;
      c8[] var4 = null;
      c8[] var5 = null;
      Object var6 = null;
      if (this.t2) {
         var1 = this.c8.n5(var1);
      }

      var2 = this.c8.n5(var2);
      var4 = this.s7;
      int var7 = this.x8;

      while (var7 != 0 && ((c8)((Object[])var4)[var7]).k5() != var1) {
         c8[][] var8 = new c8[][]{(c8[])var4};
         var7 = var8[0][var7].k5(var8);
         var4 = var8[0];
      }

      c8[][] var23 = new c8[][]{var5};
      int var9 = this.n5(var23, var1, var2, this.n3, this.y4);
      var5 = var23[0];
      if (var7 != 0) {
         var6 = this.s7;
         int var10 = this.x8;
         c8[] var11 = var5;
         int var12 = var9;

         while (var10 != var7 || var6 != var4) {
            c8[][] var13 = new c8[][]{var3};
            int var14 = ((c8)((Object[])var6)[var10]).l6(var13);
            c8[] var17 = var13[0];
            var13[0] = var17;
            var14 = this.n5(var13, ((c8)((Object[])var6)[var10]).k5(), ((c8)((Object[])var6)[var10]).z8(), var13[0], var14);
            var3 = var13[0];
            var11[var12].n5(this.a6, var3, var14);
            var11 = var3;
            var12 = var14;
            c8[][] var15 = new c8[][]{(c8[])var6};
            var10 = var15[0][var10].k5(var15);
            var6 = var15[0];
         }

         c8[][] var24 = new c8[][]{(c8[])var4};
         var7 = var24[0][var7].k5(var24);
         var4 = var24[0];
         if (var7 != 0) {
            var11[var12].n5(this.a6, var4, var7);
         }
      } else if (this.y4 != 0) {
         var5[var9].n5(this.a6, this.s7, this.x8);
      } else {
         this.u9.l6(var5, var9);
      }

      if (this.y4 != 0) {
         if (!this.n3[this.y4].m1()) {
            this.u3.push(new y4(this.s7, this.x8));
            this.n3[this.y4].n5(true);
         }

         this.s7 = var5;
         this.x8 = var9;
      }
   }

   public final void n5(z7 var1) {
      IGenericEnumerator var2 = var1.a6().iterator();

      try {
         while (var2.hasNext()) {
            e5 var3 = (e5)var2.next();
            i1 var4 = var3.a6();
            if (var4 != null) {
               if (this.z3 == null) {
                  this.z3 = new Hashtable();
               }

               this.z3.addItem(new k6(var3.l6(), var3.n5()), new k6(var4.l6(), var4.n5()));
            }
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var2, IDisposable.class)) {
            var2.dispose();
         }
      }
   }

   private y4 n5(c8[] var1, int var2, c8[] var3, int var4) {
      if (var1 != null) {
         var1[var2].l6(this.a6, var3, var4);
      }

      return new y4(var3, var4);
   }

   private int n5(c8[][] var1, String var2, String var3, c8[] var4, int var5) {
      c8[] var6 = null;
      int var7 = 0;
      int var8 = 0;
      int var9 = 0;
      c8[][] var10 = new c8[][]{var6};
      int[] var11 = new int[]{0};
      this.l6.n5(var10, var11);
      var6 = var10[0];
      var7 = var11[0];
      int[] var12 = new int[]{0};
      int[] var13 = new int[]{0};
      this.n5(false, var12, var13);
      var8 = var12[0];
      var9 = var13[0];
      s7 var14 = this.a6.n5(var2, d1.n5, d1.n5, d1.n5, var4, var6, null, this.u9, this.z1, this.t4);
      var6[var7].n5(var14, 3, var5);
      var6[var7].n5(var3);
      var6[var7].n5(var8, var9);
      var1[0] = var6;
      return var7;
   }

   private int n5(c8[][] var1, int var2, String var3, String var4, String var5, String var6) {
      c8[] var7 = null;
      int var8 = 0;
      int var9 = 0;
      int var10 = 0;
      c8[][] var11 = new c8[][]{var7};
      int[] var12 = new int[]{0};
      this.n5.n5(var11, var12);
      var7 = var11[0];
      var8 = var12[0];
      int[] var13 = new int[]{0};
      int[] var14 = new int[]{0};
      this.n5(com.aspose.slides.internal.x6s.a6.t2(var2), var13, var14);
      var9 = var13[0];
      var10 = var14[0];
      s7 var15 = this.a6.n5(var3, var4, var5, var6, this.n3, var7, var7, this.u9, this.z1, this.t4);
      var7[var8].n5(var15, var2, this.y4);
      var7[var8].n5(var9, var10);
      var1[0] = var7;
      return var8;
   }

   private void n5(boolean var1, int[] var2, int[] var3) {
      if (this.h0 == null) {
         var2[0] = 0;
         var3[0] = 0;
      } else {
         int var4;
         int var5;
         if (var1) {
            var4 = this.k5.k5();
            var5 = this.k5.u3();
         } else {
            var4 = this.h0.ah_();
            var5 = this.h0.ai_();
         }

         var2[0] = var4 - this.z1;
         if (var2[0] < 0 || var2[0] > 16383) {
            this.z1 = var4;
            var2[0] = 0;
         }

         var3[0] = var5 - this.t4;
         if (var3[0] < 0 || var3[0] > 65535) {
            this.t4 = var5;
            var3[0] = 0;
         }
      }
   }

   private void n5(int var1, String var2, String var3, String var4, String var5) {
      c8[] var6 = null;
      if (this.k5.l6()) {
         this.h0();
      }

      c8[][] var7 = new c8[][]{var6};
      int var8 = this.n5(var7, var1, var2, var3, var4, var5);
      var6 = var7[0];
      if (this.y4 != 0) {
         this.n3[this.y4].l6(var1);
         if (this.t9 != 0) {
            this.e2[this.t9].n5(this.a6, var6, var8);
         }
      }

      this.e2 = var6;
      this.t9 = var8;
   }

   private void h0() {
      int var1 = this.k5.n5();
      String var2 = this.k5.a6();
      this.n5(var1, d1.n5, d1.n5, d1.n5, d1.n5);
      this.e2[this.t9].n5(var2);
   }
}
