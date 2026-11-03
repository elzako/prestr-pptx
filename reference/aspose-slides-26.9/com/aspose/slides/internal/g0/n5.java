package com.aspose.slides.internal.g0;

import com.aspose.slides.Collections.Generic.Stack;
import com.aspose.slides.exceptions.NotSupportedException;
import com.aspose.slides.internal.e1.c4;
import com.aspose.slides.internal.e1.k7;
import com.aspose.slides.internal.e1.r4;
import com.aspose.slides.internal.e1.t2;
import com.aspose.slides.internal.e1.z1;
import com.aspose.slides.internal.o9b.f2;
import com.aspose.slides.internal.o9b.w1;
import com.aspose.slides.internal.o9b.y1;
import com.aspose.slides.internal.w0.s7;
import com.aspose.slides.internal.x4.n3;
import com.aspose.slides.internal.x4.t4;
import com.aspose.slides.internal.x4.x8;
import com.aspose.slides.internal.y6.c8;
import com.aspose.slides.internal.z0k.e2;
import com.aspose.slides.ms.System.q1;
import com.aspose.slides.ms.System.t9;

public class n5 extends x8 {
   private w1 n5;
   private final n3 l6;
   private r4 k5;
   private boolean u3;
   private c4 a6;
   private final t2 u9;
   private t2 h0;
   private final Stack<t2> c8;

   public static t2 n5(com.aspose.slides.internal.y3.u3 var0, f2 var1, y1 var2, k5 var3, y1 var4) {
      return n5(var0, var1.a6(), var2.y4(), var3, var4.y4(), false);
   }

   public static t2 n5(com.aspose.slides.internal.y3.u3 var0, f2 var1, y1 var2, k5 var3, y1 var4, boolean var5) {
      if (var0.z1() == 1) {
         byte[] var6 = com.aspose.slides.internal.y6.c8.n5(var0.n5());
         if (var6 != null) {
            var0 = new com.aspose.slides.internal.y3.u3(var6);
            var0.n3().a6(var2);
         }
      }

      return u3(var0.z1()) && !var5 ? n5(var0, var1.a6(), var2.y4(), var3) : l6(var0, var1.a6(), var2.y4(), var3, var4.y4());
   }

   private static t2 l6(com.aspose.slides.internal.y3.u3 var0, f2 var1, y1 var2, k5 var3, y1 var4) {
      n3 var5 = n3.n5(var0.z1());
      n5 var6 = new n5(var5, var1.a6(), var2.y4());
      var5.n5(var0, var6, var3, var4.y4());
      return var6.l6();
   }

   private static t2 n5(com.aspose.slides.internal.y3.u3 var0, f2 var1, y1 var2, k5 var3) {
      if (!u3(var0.z1())) {
         throw new NotSupportedException();
      }

      var0.n5().seek(0L, 0);
      com.aspose.slides.internal.y6.l6 var4 = com.aspose.slides.internal.y6.l6.n5(var0.n5());
      com.aspose.slides.internal.i5.l6 var5 = new com.aspose.slides.internal.i5.l6(
         (com.aspose.slides.internal.d9.n5)var4, com.aspose.slides.internal.o1.u3.l6()
      );
      return var5.n5(var1.a6(), var2.y4());
   }

   private n5(n3 var1, f2 var2, y1 var3) {
      this.n5 = w1.n5.u3();
      this.c8 = new Stack<>();
      this.l6 = var1;
      this.u9 = new t2();
      t2 var4 = new t2();
      this.u9.n5(var4);
      this.h0 = var4;
      y1 var5 = var3.y4();
      float var6 = var2.l6() / var5.s7();
      float var7 = var2.k5() / var5.k5();
      this.h0.n5(new com.aspose.slides.internal.w0.c8(var6, 0.0F, 0.0F, var7, 0.0F, 0.0F));
      this.h0.u3().l6(-var5.x8(), -var5.n3(), 0);
   }

   @Override
   public void n5() {
      f2 var1 = this.l6.u3().e2().a6();
      this.l6.n5(var1.a6());
      this.l6.a6().n5(var1.a6());
   }

   @Override
   public void n5(w1 var1, String var2) {
      this.l6(var1.u3(), var2, null);
   }

   @Override
   public void n5(w1 var1, String var2, short[] var3) {
      this.l6(var1.u3(), var2, var3);
   }

   private void l6(w1 var1, String var2, short[] var3) {
      if (var3 != null) {
      }

      boolean var4 = (this.l6.a6().s7() & 1) != 0;
      if (var4 && (w1.n5(var1, this.n5) || w1.n5(var1, w1.n5))) {
         this.l6.h0().n5(var1);
      }

      var1.n5(this.n5);
      f2 var5 = new f2();
      if (var3 != null && this.n5(var2, var3)) {
         var5 = new f2();

         for (int var6 = 0; var6 < var2.length(); var6++) {
            char var7 = var2.charAt(var6);
            f2 var8 = this.l6(var1.u3(), t9.q0(var7)).a6();
            f2.n5(var5, var8).l6(var5);
            short var9 = var3[var6];
            var1.n5(var1.l6() + var9);
         }
      } else {
         this.l6(var1.u3(), var2).l6(var5);
      }

      if (var4) {
         this.l6.u9(new w1(var1.l6() + var5.l6(), var1.k5()));
      }
   }

   private boolean n5(String var1, short[] var2) {
      boolean var3 = false;

      for (int var4 = 0; var4 < var2.length; var4++) {
         char var5 = var1.charAt(var4);
         f2 var6 = this.l6.a6().n5(t9.q0(var5)).a6();
         short var7 = var2[var4];
         short var8 = com.aspose.slides.internal.v6g.k5.l6(q1.l6((double)var6.l6()), 14);
         short var9 = com.aspose.slides.internal.v6g.k5.l6(q1.k5(var6.l6()), 14);
         if (var8 != var7 && var9 != var7) {
            var3 = true;
            break;
         }
      }

      return var3;
   }

   private f2 l6(w1 var1, String var2) {
      com.aspose.slides.internal.x4.k5 var3 = this.l6.a6();
      f2 var4 = var3.n5(var2).a6();
      z1 var5 = new z1(var3.a6(), var3.t2(), com.aspose.slides.internal.p1s.n5.b2, var1.u3(), var2, var4.a6(), var3.y4());
      w1[] var6 = (w1[])com.aspose.slides.ms.System.u3.n5(com.aspose.slides.ms.System.u3.n5(com.aspose.slides.internal.v6g.k5.n5(w1.class), 1));
      var1.n5(var6[0]);
      var5.n5(com.aspose.slides.internal.p1.l6.n5(var6[0].u3(), var3.z1(), var4.a6(), var5.l6(), var3.s7(), var3.u3().a6()));
      var5.n5(var6[0].u3());
      this.n5(var5);
      this.h0.n5(var5);
      return var4;
   }

   @Override
   public void n5(w1 var1, com.aspose.slides.internal.p1s.n5 var2) {
      r4 var3 = r4.n5(var1.u3(), var1.u3());
      var3.n5(new s7(var2));
      this.n5(var3, false, false);
   }

   @Override
   public void n5(w1 var1) {
      if (this.u3) {
         this.y4();
         w1[] var2 = (w1[])com.aspose.slides.ms.System.u3.n5(com.aspose.slides.ms.System.u3.n5(com.aspose.slides.internal.v6g.k5.n5(w1.class), 2));
         this.l6.h0().n5(var2[0]);
         var1.n5(var2[1]);
         this.a6.l6(var2);
      } else {
         r4 var3 = r4.n5(this.l6.h0().u3(), var1.u3());
         this.n5(var3, true, false);
      }
   }

   @Override
   public void n5(y1 var1) {
      r4 var2 = r4.n5(var1.y4());
      this.n5(var2, true, true);
   }

   @Override
   public void l6(y1 var1) {
      r4 var2 = r4.n5(var1.y4());
      this.n5(var2, false, true);
   }

   @Override
   public void k5(y1 var1) {
      r4 var2 = r4.n5(var1.y4());
      this.n5(var2, false, true, true);
   }

   @Override
   public void n5(t4 var1, s7 var2, com.aspose.slides.internal.w0.l6 var3) {
      r4 var4 = new r4();

      for (int var5 = 0; var5 < var1.u3().size(); var5++) {
         var4.n5(c4.n5(var1.u3().get_Item(var5).y4()));
      }

      this.n5(var4, var2, var3);
   }

   @Override
   public void n5(w1[] var1) {
      if (var1.length > 0) {
         if (this.u3) {
            this.y4();
            this.a6.l6(var1);
         } else {
            r4 var2 = com.aspose.slides.internal.g0.u3.n5(var1, false);
            this.n5(var2, true, false);
         }
      }
   }

   @Override
   public void l6(w1[] var1) {
      if (var1.length > 0) {
         if (this.u3) {
            this.y4();
            this.a6.k5(var1);
         } else {
            r4 var2 = com.aspose.slides.internal.g0.u3.n5(var1);
            this.n5(var2, true, false);
         }
      }
   }

   @Override
   public void n5(w1[][] var1) {
      if (var1.length >= 0) {
         if (this.u3) {
            for (w1[] var5 : var1) {
               this.y4();
               this.a6.l6(var5);
               this.n5(false);
            }
         } else {
            r4 var6 = com.aspose.slides.internal.g0.u3.n5(var1, false);
            this.n5(var6, true, false);
         }
      }
   }

   @Override
   public void k5(w1[] var1) {
      if (var1.length > 0) {
         if (this.u3) {
            this.y4();
            this.a6.l6(var1);
            this.n5(true);
         } else {
            r4 var2 = com.aspose.slides.internal.g0.u3.n5(var1, true);
            this.n5(var2, true, true);
         }
      }
   }

   @Override
   public void l6(w1[][] var1) {
      if (var1.length > 0) {
         if (this.u3) {
            for (w1[] var5 : var1) {
               this.y4();
               this.a6.l6(var5);
               this.n5(true);
            }
         } else {
            r4 var6 = com.aspose.slides.internal.g0.u3.n5(var1, true);
            this.n5(var6, true, true);
         }
      }
   }

   @Override
   public void n5(y1 var1, w1 var2, w1 var3) {
      r4 var4 = com.aspose.slides.internal.g0.u3.n5(var1.y4(), var2.u3(), var3.u3());
      this.n5(var4, true, false);
   }

   @Override
   public void u3(y1 var1) {
      r4 var2 = com.aspose.slides.internal.g0.u3.n5(var1.y4());
      this.n5(var2, true, true);
   }

   @Override
   public void l6(y1 var1, w1 var2, w1 var3) {
      r4 var4 = com.aspose.slides.internal.g0.u3.l6(var1.y4(), var2.u3(), var3.u3());
      this.n5(var4, true, true);
   }

   @Override
   public void k5(y1 var1, w1 var2, w1 var3) {
      r4 var4 = com.aspose.slides.internal.g0.u3.k5(var1.y4(), var2.u3(), var3.u3());
      this.n5(var4, true, true);
   }

   @Override
   public void n5(y1 var1, f2 var2) {
      r4 var3 = com.aspose.slides.internal.g0.u3.n5(var1.y4(), var2.a6());
      this.n5(var3, true, true);
   }

   @Override
   public void n5(y1 var1, y1 var2, byte[] var3) {
      t2 var4 = new t2();
      w1 var5 = new w1(var2.a6(), var2.t2());
      f2 var6 = new f2(var2.s7(), var2.k5());
      if (this.l6.a6().c8() == 1) {
         try {
            com.aspose.slides.internal.o9b.l6 var7 = new com.aspose.slides.internal.o9b.l6(new e2(var3));

            try {
               var7.n5();
               e2 var8 = new e2();

               try {
                  var7.n5(var8, com.aspose.slides.internal.j9e.x8.s7());
                  var3 = var8.toArray();
               } finally {
                  if (var8 != null) {
                     var8.dispose();
                  }
               }
            } finally {
               if (var7 != null) {
                  var7.dispose();
               }
            }
         } catch (RuntimeException var19) {
         }
      }

      k7 var20 = new k7(var5.u3(), var6.a6(), var3);
      var20.n5(this.l6.a6().c8());
      var4.n5(var20);
      var4.n5(this.l6.a6().z1().k5());
      this.h0.n5(var4);
   }

   @Override
   public void n5(y1 var1, y1 var2, com.aspose.slides.internal.w0.c8 var3, com.aspose.slides.internal.p1s.n5 var4, int var5, byte[] var6) {
      t2 var7 = new t2();
      w1 var8 = new w1(var2.a6(), var2.t2());
      f2 var9 = new f2(var2.s7(), var2.k5());
      k7 var10 = new k7(var8.u3(), var9.a6(), var6);
      var7.n5(var10);
      var7.n5(this.l6.a6().z1().k5());
      var7.u3().n5(var3, 0);
      this.h0.n5(var7);
   }

   private void n5(r4 var1, boolean var2, boolean var3) {
      this.n5(var1, var2, var3, false);
   }

   private void n5(r4 var1, boolean var2, boolean var3, boolean var4) {
      com.aspose.slides.internal.x4.k5 var5 = this.l6.a6();
      s7 var6 = var2 ? var5.l6() : null;
      com.aspose.slides.internal.w0.l6 var7 = var3 ? var5.k5() : null;
      if (var4 && var7 != null) {
         var7 = new com.aspose.slides.internal.w0.n3(var5.h0());
      }

      this.n5(var1, var6, var7);
   }

   private void n5(r4 var1, s7 var2, com.aspose.slides.internal.w0.l6 var3) {
      if (var2 == null && var3 == null) {
         if (var1.l6() == null) {
            return;
         }

         var2 = var1.l6();
      }

      var1.n5(var2);
      var1.n5(var3);
      com.aspose.slides.internal.x4.k5 var4 = this.l6.a6();
      var1.k5(n3.h0(var4.x8()));
      var1.n5(var4.z1().k5());
      var1.l6(var4.n3());
      this.h0.n5(var1);
   }

   @Override
   public void n5(int var1) {
      if (this.u3) {
         this.k5.k5(n3.h0(this.l6.a6().x8()));
      }
   }

   private void n5(z1 var1) {
      y1 var2 = new y1(var1.s7().u3(), var1.y4().a6());
      r4 var3 = r4.n5(var2.y4());
      var3.n5(new com.aspose.slides.internal.w0.n3(this.l6.a6().h0()));
      var3.n5(var1.u3().k5());
      var3.u3().l6(0.0F, -var1.l6().t2(), 0);
      this.h0.n5(var3);
   }

   public final t2 l6() {
      return this.u9;
   }

   private void y4() {
      if (this.a6 == null) {
         this.a6 = new c4();
      }
   }

   @Override
   public void k5() {
      this.n5(true);
   }

   @Override
   public void u3() {
      this.u3 = true;
      this.k5 = new r4();
   }

   @Override
   public void a6() {
      this.n5(false);
      this.e2();
      this.u3 = false;
   }

   @Override
   public void u9() {
      this.e2();
   }

   private void e2() {
      if (this.u3 && this.k5.u3() == null) {
         this.k5.n5(this.l6.a6().z1().k5());
      }
   }

   @Override
   public void n5(boolean var1) {
      if (this.a6 != null) {
         this.a6.n5(var1);
         this.k5.n5(this.a6);
         this.a6 = null;
      }
   }

   @Override
   public void h0() {
      com.aspose.slides.internal.w0.l6 var1 = this.l6.a6().k5();
      if (this.k5 != null && var1 != null) {
         this.n5(true);
         this.k5.n5(var1);
         this.t9();
      }
   }

   @Override
   public void c8() {
      s7 var1 = this.l6.a6().l6();
      if (this.k5 != null && var1 != null) {
         this.n5(false);
         this.k5.n5(var1);
         this.t9();
      }
   }

   @Override
   public void t2() {
      com.aspose.slides.internal.w0.l6 var1 = this.l6.a6().k5();
      s7 var2 = this.l6.a6().l6();
      if (this.k5 != null && (var1 != null || var2 != null)) {
         this.n5(false);
         this.k5.n5(var1);
         this.k5.n5(var2);
         this.t9();
      }
   }

   private void t9() {
      this.h0.n5(this.k5);
      this.k5 = null;
   }

   @Override
   public void l6(int var1) {
      if (this.k5 != null) {
         this.n5(true);
         this.n5(this.k5);
         this.k5 = null;
      }
   }

   @Override
   public void s7() {
      this.c8.push(this.h0);
      t2 var1 = new t2();
      this.h0.n5(var1);
      this.h0 = var1;
   }

   @Override
   public void a6(y1 var1) {
      this.x8();
      this.l6.a6().t4().l6(var1.y4());
   }

   @Override
   public void u9(y1 var1) {
      this.x8();
      this.l6.a6().t4().n5(var1.y4());
   }

   @Override
   public void x8() {
      this.z1();
      this.t4();
   }

   @Override
   public void n3() {
      this.z1();
      this.h0 = this.c8.pop();
   }

   private void n5(r4 var1) {
      if (var1.u3() != null) {
         var1.l6(var1.u3());
         var1.n5((com.aspose.slides.internal.w0.c8)null);
      }

      this.h0.n5(var1);
   }

   private void z1() {
      com.aspose.slides.internal.x4.k5 var1 = this.l6.a6();
      if (var1.q0() && (this.h0.a6() == null || this.h0.a6().t2() == 0)) {
         r4 var2 = com.aspose.slides.internal.j7.x8.n5(var1.t4());
         this.n5(var2);
      }
   }

   private void t4() {
      t2 var1 = new t2();
      com.aspose.slides.internal.e1.n3 var2 = (com.aspose.slides.internal.e1.n3)this.h0.y2();
      var1.n5(this.h0.u3());
      if (var2 != null) {
         var2.n5(var1);
      }

      this.h0 = var1;
   }

   private static boolean u3(int var0) {
      return var0 == 3 || var0 == 5 || var0 == 4;
   }
}
