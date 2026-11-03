package com.aspose.slides.internal.b7;

import com.aspose.slides.IGenericCloneable;
import com.aspose.slides.Collections.Generic.IGenericEnumerable;
import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.ms.System.IDisposable;

public abstract class n2z extends z3 implements IGenericCloneable<n2z> {
   private z6e n5;
   private static final com.aspose.slides.internal.v6g.u9 l6 = new com.aspose.slides.internal.v6g.u9(
      "textArchDown",
      "textArchDownPour",
      "textArchUp",
      "textArchUpPour",
      "textButton",
      "textButtonPour",
      "textCanDown",
      "textCanUp",
      "textCascadeDown",
      "textCascadeUp",
      "textChevron",
      "textChevronInverted",
      "textCircle",
      "textCirclePour",
      "textCurveDown",
      "textCurveUp",
      "textDeflate",
      "textDeflateBottom",
      "textDeflateInflate",
      "textDeflateInflateDeflate",
      "textDeflateTop",
      "textDoubleWave1",
      "textFadeDown",
      "textFadeLeft",
      "textFadeRight",
      "textFadeUp",
      "textInflate",
      "textInflateBottom",
      "textInflateTop",
      "textNoShape",
      "textPlain",
      "textRingInside",
      "textRingOutside",
      "textSlantDown",
      "textSlantUp",
      "textStop",
      "textTriangle",
      "textTriangleInverted",
      "textWave1",
      "textWave2",
      "textWave4"
   );

   final z6e u9() {
      return this.n5;
   }

   public final void n5(z6e var1) {
      if (this.n5 != var1) {
         if (var1 == null) {
            throw new ArgumentNullException("value");
         }

         this.n5 = var1.a6();
      }
   }

   public abstract int n5();

   public static n2z n5(int var0) {
      switch (var0) {
         case 0:
            return new m9();
         case 1:
            return new j7();
         case 2:
            return new t4r();
         case 3:
            return new c1x();
         case 4:
            return new c7f();
         case 5:
            return new v3();
         case 6:
            return new v8();
         case 7:
            return new g3();
         case 8:
            return new e1();
         case 9:
            return new w1();
         case 10:
            return new z8();
         case 11:
            return new i9();
         case 12:
            return new h2();
         case 13:
            return new j5();
         case 14:
            return new m3();
         case 15:
            return new j4();
         case 16:
            return new a5();
         case 17:
            return new r1();
         case 18:
            return new r8();
         case 19:
            return new j9();
         case 20:
            return new x9();
         case 21:
            return new s2b();
         case 22:
            return new o5k();
         case 23:
            return new q2();
         case 24:
            return new n1g();
         case 25:
            return new k1();
         case 26:
            return new f4();
         case 27:
            return new o4();
         case 28:
            return new z5();
         case 29:
            return new o6();
         case 30:
            return new y9();
         case 31:
            return new a8();
         case 32:
            return new h5();
         case 33:
            return new h9();
         case 34:
            return new r5();
         case 35:
            return new r7();
         case 36:
            return new r6();
         case 37:
            return new f9();
         case 38:
            return new e3();
         case 39:
            return new e9();
         case 40:
            return new z6();
         default:
            return new m9();
      }
   }

   public abstract n2z u3();

   final r7c[] n5(IGenericEnumerable<l2p> var1, v7u var2) {
      List var3 = new List();
      IGenericEnumerator var4 = var1.iterator();

      for (t9p var8 : var2.l6()) {
         List var9 = new List();
         double var10 = 0.0;
         u0a var12 = com.aspose.slides.internal.v6g.k5.n5(var8.n5().l6(), u0a.class);
         if (var12 != null) {
            var4.hasNext();
            var9.addItem(var4.next());
         }

         for (g1p var16 : var8.l6()) {
            m5 var17 = com.aspose.slides.internal.v6g.k5.n5(var16, m5.class);
            if (var17 != null) {
               for (int var18 = 0; var18 < var17.n5().length(); var18++) {
                  if (var17.n5().charAt(var18) != 11 && var17.n5().charAt(var18) != '\n') {
                     var4.hasNext();
                     var9.addItem(var4.next());
                  } else {
                     var3.addItem(new n2z$n5(var8.n5().u9(), (l2p[])var9.toArray(new l2p[0]), var10));
                     var9.clear();
                  }
               }

               if (var17.u3().h0() > var10) {
                  var10 = var17.u3().h0();
               }
            }
         }

         var3.addItem(new n2z$n5(var8.n5().u9(), (l2p[])var9.toArray(new l2p[0]), var10));
      }

      return this.n5(var3);
   }

   final w8d[] h0() {
      List var1 = this.a6().n5();
      w8d[] var2 = new w8d[var1.size()];

      for (int var3 = 0; var3 < var2.length; var3++) {
         var2[var3] = new w8d((n7)var1.get_Item(var3));
      }

      return var2;
   }

   abstract r7c[] n5(List<n2z$n5> var1);

   public abstract d1 a6();

   static int[] n5(int var0, int var1) {
      int[] var2 = new int[var1];
      byte var3 = 0;

      for (int var4 = 0; var4 < var0; var4++) {
         var2[var3]++;
         var3 = (byte)(var3 + 1 < var1 ? var3 + 1 : 0);
      }

      return var2;
   }

   final r7c[] n5(l2p[] var1, g8v var2, w8d var3, w8d var4) {
      r7c[] var5 = new r7c[var1.length];

      for (int var6 = 0; var6 < var1.length; var6++) {
         y8 var7 = var1[var6].u3().l6();
         y8 var8 = new y8();
         IGenericEnumerator var9 = var7.iterator();

         try {
            while (var9.hasNext()) {
               h6 var10 = (h6)var9.next();
               h6 var11 = new h6(var10.k5(), var10.u3());
               if (var10.n5() > 0) {
                  k0 var12 = var10.n5(0).u3();
                  int var13 = var10.l6() ? var10.n5() + 1 : var10.n5();

                  for (int var14 = 1; var14 < var13; var14++) {
                     k0 var15 = (var14 < var10.n5() ? var10.n5(var14) : var10.n5(0)).u3();
                     this.n5(var12.u3(), var15.u3(), var3, var4, var2, var11);
                     var15.n5(var12);
                  }

                  if (var10.l6()) {
                     var11.a6();
                  }
               }

               var8.n5(var11);
            }
         } finally {
            if (com.aspose.slides.internal.v6g.k5.n5(var9, IDisposable.class)) {
               var9.dispose();
            }
         }

         var5[var6] = new r7c(var8, var1[var6].u3().n5().c8());
      }

      return var5;
   }

   private void n5(k0 var1, k0 var2, w8d var3, w8d var4, g8v var5, h6 var6) {
      v2 var7 = k0.n5(var2, var1).u9();
      k0 var8 = new k0(var1.n5() + var7.n5() / 2.0, var1.l6() + var7.l6() / 2.0);
      k0 var9 = this.n5(var5, var1.u3(), var3, var4).u3();
      k0 var10 = this.n5(var5, var8.u3(), var3, var4).u3();
      k0 var11 = this.n5(var5, var2.u3(), var3, var4).u3();
      v2 var12 = k0.n5(var11, var9).u9();
      v2 var13 = k0.n5(var11, var10).u9();
      if (var13.k5() > 1.0E-6 && var12.k5() > 1.0E-6) {
         double var14 = var12.n5(var13.u9());
         double var16 = 0.03490658503988659;
         if (var14 < 0.03490658503988659) {
            var6.n5(var11.u3());
         } else {
            this.n5(var1.u3(), var8.u3(), var3, var4, var5, var6);
            this.n5(var8.u3(), var2.u3(), var3, var4, var5, var6);
         }
      } else {
         var6.n5(var11.u3());
      }
   }

   private k0 n5(g8v var1, k0 var2, w8d var3, w8d var4) {
      k0 var5 = new k0(this.u9().n5().n5(), this.u9().n5().l6());
      double var6 = var1.n5(var2.n5());
      double var8 = var1.l6(var2.l6());
      k0 var10 = var3.l6(var6).u3();
      k0 var11 = var4.l6(var6).u3();
      v2 var12 = k0.n5(var11, var10).u9();
      return new k0(var5.n5() + var10.n5() + var12.n5() * var8, var5.l6() + var10.l6() + var12.l6() * var8);
   }

   // $VF: synthetic method
   @Override

   // Restored from the original synthetic/bridge forwarding bytecode.
   public n2z cloneT() {
      return this.u3();
   }

}
