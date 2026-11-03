package com.aspose.slides.internal.b8c;

import com.aspose.slides.Collections.IEnumerator;
import com.aspose.slides.ms.System.IDisposable;

public class l9 extends j9e implements Cloneable {
   private int n5 = 256;
   private m5 l6;
   private c1 k5;
   private z4 u3;
   private k9 a6;
   private c1 u9 = c1.n5;
   private int h0;
   private d0 c8;
   private d0 t2;
   private k9 s7;
   private static l9 x8 = s7(2);
   private static l9 n3 = s7(1);
   private static l9 y4 = new l9();
   private byte e2;

   private static l9 s7(int var0) {
      l9 var1 = new l9();
      var1.l6(t4.l6);
      f7 var2 = new f7();
      var2.n5(com.aspose.slides.ms.System.c4.a6.l6());
      var2.l6(com.aspose.slides.ms.System.c4.l6.l6());
      var2.n5(var0);
      var2.k5(null);
      f1s var3 = new f1s();
      var3.n5().n5(var2);
      var1.l6(var3);
      var1.t2(3);
      var1.n5(t6.u9());
      var1.u6().n5(var1);
      l5 var4 = new l5(3);
      var4.a6();
      var4.u9();
      var4.n5(var2.u9(), var2);
      var4.s7();
      var4.h0();
      z1 var5 = var4.l6(true);
      var1.u6().n5(var5);
      k9 var6 = new k9();
      var6.n5(var0);
      var6.k5(null);
      var1.l6(var6);
      var1.u6().n5(var6);
      return var1;
   }

   public static l9 n5() {
      return x8;
   }

   public static l9 l6() {
      return y4;
   }

   public static l9 u9() {
      return n3;
   }

   public static z1 h0() {
      return x8.u6().z1();
   }

   public final boolean c8() {
      return (this.e2 & 255 & 4) != 0;
   }

   public final void n5(boolean var1) {
      if (var1) {
         this.e2 = (byte)(this.e2 & 0xFF | 4);
      } else {
         this.e2 = (byte)(this.e2 & 0xFF & -5);
      }
   }

   public final int t2() {
      return this.n5;
   }

   public final void n5(int var1) {
      this.n5 = var1;
   }

   @Override
   public boolean s7() {
      return (this.e2 & 255 & 2) != 0;
   }

   @Override
   public void l6(boolean var1) {
      if (var1) {
         this.e2 = (byte)(this.e2 & 0xFF | 2);
      } else {
         this.e2 = (byte)(this.e2 & 0xFF & -3);
      }
   }

   public final m5 x8() {
      return this.l6;
   }

   public final void n5(m5 var1) {
      this.l6 = var1;
   }

   public final c1 n3() {
      return this.k5;
   }

   public final void n5(c1 var1) {
      this.k5 = var1;
   }

   public final z4 y4() {
      if (this.u3 == null) {
         this.u3 = new z4();
      }

      return this.u3;
   }

   public final k9 e2() {
      return this.a6;
   }

   public final void n5(k9 var1) {
      this.a6 = var1;
   }

   public final int t9() {
      return this.v4();
   }

   public final c1 q0() {
      return this.u9;
   }

   public final int z3() {
      return this.h0;
   }

   public final d0 m1() {
      if (this.t2 == null) {
         this.t2 = new d0();
      }

      return this.t2;
   }

   public final k9 k7() {
      return this.s7;
   }

   public final d0 m3() {
      if (this.c8 == null) {
         this.c8 = new d0();
      }

      return this.c8;
   }

   public final void l6(c1 var1) {
      this.u9 = var1;
   }

   public final void l6(int var1) {
      this.h0 = var1;
   }

   public final void l6(k9 var1) {
      this.s7 = var1;
   }

   public final boolean z8() {
      return (this.e2 & 255 & 1) != 0;
   }

   public final void k5(boolean var1) {
      if (var1) {
         this.e2 = (byte)(this.e2 & 0xFF | 1);
      } else {
         this.e2 = (byte)(this.e2 & 0xFF & -2);
      }
   }

   public final void n5(z4 var1) {
      this.u3 = var1;
   }

   public final boolean u3(boolean var1) {
      int var2 = 0;
      IEnumerator var3 = this.m1().k5().iterator();

      try {
         while (var3.hasNext()) {
            l2 var4 = (l2)var3.next();
            if (var4.x8() != 2) {
               v5 var5 = var4.e2();
               if (var5 != null && var5.n3() == 37) {
                  if (++var2 > 1) {
                     break;
                  }
               }
            }
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var3, IDisposable.class)) {
            ((IDisposable)var3).dispose();
         }
      }

      return var1 ? var2 > 1 : var2 > 0;
   }

   @Override
   public x4 d2() {
      return this.n5((a9)null);
   }

   public final x4 n5(a9 var1) {
      l9 var2 = (l9)this.af_();
      if (var2.x8() != null) {
         y9w var3 = com.aspose.slides.internal.v6g.k5.n5(var2.x8(), y9w.class);
         if (var3 != null) {
            y9w var4 = (y9w)var3.d2();
            i0e var5 = com.aspose.slides.internal.v6g.k5.n5(var3.n5(), i0e.class);
            if (var5 != null) {
               i0e var6 = (i0e)var5.d2();
               var6.n5(var5.n5().a6());
               var6.n5(l6(var5.l6()));
               var4.n5(var6);
            } else {
               f6z var11 = (f6z)var3.n5();
               f6z var7 = (f6z)var11.d2();
               var7.n5(var11.n5().a6());
               var7.n5(l6(var11.h0()));
               var4.n5(var7);
            }

            var2.n5(var4);
         } else {
            p0 var9 = (p0)var2.x8();
            p0 var10 = (p0)var9.d2();
            s1 var12 = com.aspose.slides.internal.v6g.k5.n5(var9.l6(), s1.class);
            if (var12 != null) {
               s1 var13 = (s1)var12.d2();
               var13.n5(var12.n5().a6());
               var13.n5(l6(var12.u9()));
               if (l6(var12.l6(), var1)) {
                  var13.n5(n5(var12.l6(), var1));
               }

               var10.n5(var13);
            } else {
               g9 var14 = com.aspose.slides.internal.v6g.k5.n5(var9.l6(), g9.class);
               g9 var8 = (g9)var14.d2();
               var8.n5(var14.n5().a6());
               var8.n5(l6(var14.u9()));
               if (l6(var8.l6(), var1)) {
                  var8.n5(n5(var8.l6(), var1));
               }

               var10.n5(var8);
            }

            var2.n5(var10);
         }
      } else {
         if (l6(var2.n3(), var1)) {
            var2.n5(n5(var2.n3(), var1));
         }

         var2.n5(l6(var2.y4()));
      }

      var2.a5();
      return var2;
   }

   private void a5() {
      this.t2 = null;
      this.c8 = null;
      this.s7 = null;
      this.u9 = c1.n5;
      this.h0 = 256;
   }

   public static z4 l6(z4 var0) {
      if (!k5(var0)) {
         return var0;
      }

      z4 var1 = var0.l6();

      for (int var2 = 0; var2 < var0.size(); var2++) {
         x4 var3 = var0.n5(var2);
         k0 var4 = com.aspose.slides.internal.v6g.k5.n5(var3, k0.class);
         if (var4 != null) {
            k0 var5 = (k0)var4.d2();
            var5.n5(var4.n5().a6());
            var1.n5(var2, var5);
         } else {
            l2 var6 = com.aspose.slides.internal.v6g.k5.n5(var3, l2.class);
            if (!var6.c8().k5() || !var6.t2().k5()) {
               var1.n5(var2, var6.d2());
            }
         }
      }

      return var1;
   }

   private static z4 n5(z4 var0, a9 var1) {
      z4 var2 = var0.l6();

      for (int var3 = 0; var3 < var0.size(); var3++) {
         c1 var4 = (c1)var0.n5(var3);
         var2.n5(var3, n5(var4, var1));
      }

      return var2;
   }

   public static c1 n5(c1 var0, a9 var1) {
      g3 var2 = com.aspose.slides.internal.v6g.k5.n5(var0, g3.class);
      if (var2 != null) {
         z4 var4 = n5(var2.n5(), var1);
         g3 var6 = (g3)var2.d2();
         var6.n5(var4);
         return var6;
      } else if (com.aspose.slides.internal.v6g.k5.l6(var0, e1.class)) {
         e1 var5 = (e1)var0.d2();
         var5.n5(var5.n5().a6());
         return var5;
      } else {
         v1 var3 = com.aspose.slides.internal.v6g.k5.n5(var0, v1.class);
         return var3 == null || var3.q0().k5() && var3.m1().k5() && n5(var1, var3) != 1 ? var0 : (v1)var3.n5(var1);
      }
   }

   private static int n5(a9 var0, v1 var1) {
      return var1.x8() == 0 && var0 != null ? var0.u3() : var1.x8();
   }

   public static boolean l6(c1 var0, a9 var1) {
      g3 var2 = com.aspose.slides.internal.v6g.k5.n5(var0, g3.class);
      if (var2 == null) {
         return com.aspose.slides.internal.v6g.k5.l6(var0, e1.class);
      }

      boolean var3 = false;
      int var4 = 0;

      while (var4 < var2.n5().size() && !var3) {
         c1 var5 = (c1)var2.n5().n5(var4++);
         if (com.aspose.slides.internal.v6g.k5.l6(var5, e1.class)) {
            var3 = true;
         } else {
            v1 var6 = com.aspose.slides.internal.v6g.k5.n5(var5, v1.class);
            if (var6 == null || var6.q0().k5() && var6.m1().k5() && n5(var1, var6) != 1) {
               var3 = l6(var5, var1);
            } else {
               var3 = true;
            }
         }
      }

      return var3;
   }

   public static boolean k5(z4 var0) {
      for (int var1 = 0; var1 < var0.size(); var1++) {
         if (com.aspose.slides.internal.v6g.k5.l6(var0.n5(var1), k0.class)) {
            return true;
         }

         l2 var2 = com.aspose.slides.internal.v6g.k5.n5(var0.n5(var1), l2.class);
         if (!var2.c8().k5() || !var2.t2().k5()) {
            return true;
         }
      }

      return false;
   }

   @Override
   protected Object af_() {
      try {
         return this.clone();
      } catch (CloneNotSupportedException var2) {
         throw new IllegalStateException(var2);
      }
   }

   static {
      y4.l6(new com.aspose.slides.ms.System.Xml.k6("untypedAny", "http://www.w3.org/2003/11/XPath-datatypes"));
      y4.l6(true);
      y4.l6(x8.q0());
      y4.t2(3);
      y4.n5(t6.u9());
      y4.u6().n5(y4);
      y4.u6().n5(h0());
   }
}
