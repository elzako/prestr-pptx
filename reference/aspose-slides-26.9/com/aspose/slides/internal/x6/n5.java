package com.aspose.slides.internal.x6;

import com.aspose.slides.Collections.Generic.Dictionary;
import com.aspose.slides.Collections.Generic.Dictionary$KeyCollection$Enumerator;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.Collections.Generic.List$Enumerator;
import com.aspose.slides.exceptions.IOException;
import com.aspose.slides.internal.l7.h0;
import com.aspose.slides.internal.l7h.a5;
import com.aspose.slides.internal.z0k.j5;
import com.aspose.slides.ms.System.IDisposable;
import com.aspose.slides.ms.System.d1;

public class n5 {
   private static final List<Integer> l6 = new List<>();
   private static final List<Integer> k5 = new List<>();
   public static final int n5 = com.aspose.slides.internal.r2.n5.n5(1, 0);
   private final int u3;
   private final byte[] a6;
   private long u9;
   private Dictionary<Integer, h0> h0;

   private n5(int var1, byte[] var2) {
      this.u3 = var1;
      this.a6 = var2;
   }

   public final byte[] n5() {
      if (this.a6 == null) {
         return null;
      }

      byte[] var1 = new byte[this.a6.length];
      com.aspose.slides.ms.System.u3.n5(com.aspose.slides.ms.System.u3.n5((Object)(this.a6)), com.aspose.slides.ms.System.u3.n5((Object)(var1)), this.a6.length);
      return var1;
   }

   public final int l6() {
      return this.h0.size();
   }

   public final com.aspose.slides.internal.q9.l6 k5() {
      return new com.aspose.slides.internal.q9.n5(this.h0.getValues());
   }

   public final boolean n5(int var1) {
      return this.h0.containsKey(var1);
   }

   public final h0 l6(int var1) {
      Object var2 = null;
      h0[] var3 = new h0[]{(h0)var2};
      this.h0.tryGetValue(var1, var3);
      return var3[0];
   }

   public final Dictionary<Integer, h0> u3() {
      return this.h0;
   }

   @Override
   public final String toString() {
      a5 var1 = new a5();
      var1.n5("digest = ");
      byte[] var2 = this.n5();
      if (var2 != null) {
         for (int var3 = 0; var3 < var2.length; var3++) {
            int var4 = 0xFF & var2[var3] & 255;
            if (var4 < 16) {
               var1.n5("0");
            }

            var1.n5(d1.n5("{0:x}", new Object[]{var4}));
         }
      }

      var1.n5("\n[");
      var1.n5(com.aspose.slides.internal.r2.n5.k5(this.u3));
      var1.n5(", ");
      var1.k5(this.l6());
      var1.n5("]\n");
      com.aspose.slides.internal.q9.l6 var5 = this.k5();

      while (var5.n5()) {
         com.aspose.slides.internal.l7.l6 var6 = (com.aspose.slides.internal.l7.l6)var5.l6();
         var1.n5("\t");
         var1.n5(var6);
         var1.n5("\n");
      }

      return var1.toString();
   }

   public final void n5(j5 var1, List<Integer> var2) {
      List var3 = this.l6(var2);
      List var4 = this.n5(var3);
      com.aspose.slides.internal.m9.u3 var5 = new com.aspose.slides.internal.m9.u3(var1);
      this.n5(var5, var4);
      this.l6(var5, var4);
   }

   private List<com.aspose.slides.internal.l7.u3> n5(List<Integer> var1) {
      List var2 = this.l6(var1);
      List var3 = new List(this.l6());
      int var4 = 12 + this.l6() * 16;
      List$Enumerator var5 = var2.iterator();

      try {
         while (var5.hasNext()) {
            int var6 = com.aspose.slides.internal.v6g.k5.u3(var5.next(), int.class);
            h0 var7 = null;
            h0[] var8 = new h0[]{var7};
            boolean var9 = this.h0.tryGetValue(var6, var8);
            var7 = var8[0];
            if (var9) {
               com.aspose.slides.internal.l7.u3 var10 = new com.aspose.slides.internal.l7.u3(var6, var7.k5(), var4, var7.u3().k5());
               var3.addItem(var10);
               var4 += var7.l6() + 3 & -4;
            }
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var5, IDisposable.class)) {
            var5.dispose();
         }
      }

      return var3;
   }

   private void n5(com.aspose.slides.internal.m9.u3 var1, List<com.aspose.slides.internal.l7.u3> var2) {
      var1.k5(this.u3);
      var1.l6(var2.size());
      int var3 = com.aspose.slides.internal.r2.l6.n5(var2.size());
      int var4 = 2 << var3 - 1 + 4;
      var1.l6(var4);
      var1.l6(var3);
      var1.l6(var2.size() * 16 - var4);
      List var5 = new List(var2);
      var5.sort(com.aspose.slides.internal.l7.u3.l6);
      List$Enumerator var6 = var5.iterator();

      try {
         while (var6.hasNext()) {
            com.aspose.slides.internal.l7.u3 var7 = (com.aspose.slides.internal.l7.u3)var6.next();
            var1.n5((long)var7.n5());
            var1.n5(var7.u3());
            var1.n5((long)var7.l6());
            var1.n5((long)var7.k5());
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var6, IDisposable.class)) {
            var6.dispose();
         }
      }
   }

   private void l6(com.aspose.slides.internal.m9.u3 var1, List<com.aspose.slides.internal.l7.u3> var2) {
      List$Enumerator var3 = var2.iterator();

      try {
         while (var3.hasNext()) {
            com.aspose.slides.internal.l7.u3 var4 = (com.aspose.slides.internal.l7.u3)var3.next();
            h0 var5 = this.l6(var4.n5());
            if (var5 == null) {
               throw new IOException("Table out of sync with font header.");
            }

            int var6 = var5.n5(var1.n5());
            int var7 = (var6 + 3 & -4) - var6;

            for (int var8 = 0; var8 < var7; var8++) {
               var1.n5(0);
            }
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var3, IDisposable.class)) {
            var3.dispose();
         }
      }
   }

   private List<Integer> l6(List<Integer> var1) {
      if (var1 == null) {
         var1 = this.a6();
      }

      List var2 = new List();
      Dictionary$KeyCollection$Enumerator var3 = this.h0.getKeys().iterator();

      try {
         while (var3.hasNext()) {
            int var4 = com.aspose.slides.internal.v6g.k5.u3(var3.next(), int.class);
            var2.addItem(var4);
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var3, IDisposable.class)) {
            var3.dispose();
         }
      }

      List var21 = new List(this.h0.size());
      List$Enumerator var5 = var1.iterator();

      try {
         while (var5.hasNext()) {
            int var6 = com.aspose.slides.internal.v6g.k5.u3(var5.next(), int.class);
            if (this.n5(var6)) {
               var21.addItem(var6);
               var2.removeItem(var6);
            }
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var5, IDisposable.class)) {
            var5.dispose();
         }
      }

      List$Enumerator var22 = var2.iterator();

      try {
         while (var22.hasNext()) {
            int var7 = com.aspose.slides.internal.v6g.k5.u3(var22.next(), int.class);
            var21.addItem(var7);
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var22, IDisposable.class)) {
            var22.dispose();
         }
      }

      return var21;
   }

   private List<Integer> a6() {
      return this.n5(com.aspose.slides.internal.x6.k5.t9) ? l6 : k5;
   }

   // $VF: synthetic method
   static Dictionary n5(n5 var0, Dictionary var1) {
      return var0.h0 = var1;
   }

   // $VF: synthetic method
   static long n5(n5 var0, long var1) {
      return var0.u9 = var1;
   }

   static {
      l6.addItem(com.aspose.slides.internal.x6.k5.k5);
      l6.addItem(com.aspose.slides.internal.x6.k5.u3);
      l6.addItem(com.aspose.slides.internal.x6.k5.u9);
      l6.addItem(com.aspose.slides.internal.x6.k5.c8);
      l6.addItem(com.aspose.slides.internal.x6.k5.h0);
      l6.addItem(com.aspose.slides.internal.x6.k5.l6);
      l6.addItem(com.aspose.slides.internal.x6.k5.t2);
      l6.addItem(com.aspose.slides.internal.x6.k5.t9);
      k5.addItem(com.aspose.slides.internal.x6.k5.k5);
      k5.addItem(com.aspose.slides.internal.x6.k5.u3);
      k5.addItem(com.aspose.slides.internal.x6.k5.u9);
      k5.addItem(com.aspose.slides.internal.x6.k5.c8);
      k5.addItem(com.aspose.slides.internal.x6.k5.a6);
      k5.addItem(com.aspose.slides.internal.x6.k5.y1);
      k5.addItem(com.aspose.slides.internal.x6.k5.d2);
      k5.addItem(com.aspose.slides.internal.x6.k5.c4);
      k5.addItem(com.aspose.slides.internal.x6.k5.l6);
      k5.addItem(com.aspose.slides.internal.x6.k5.x8);
      k5.addItem(com.aspose.slides.internal.x6.k5.e2);
      k5.addItem(com.aspose.slides.internal.x6.k5.s7);
      k5.addItem(com.aspose.slides.internal.x6.k5.y4);
      k5.addItem(com.aspose.slides.internal.x6.k5.n3);
      k5.addItem(com.aspose.slides.internal.x6.k5.y2);
      k5.addItem(com.aspose.slides.internal.x6.k5.h0);
      k5.addItem(com.aspose.slides.internal.x6.k5.t2);
      k5.addItem(com.aspose.slides.internal.x6.k5.r4);
      k5.addItem(com.aspose.slides.internal.x6.k5.a0);
      k5.addItem(com.aspose.slides.internal.x6.k5.w1);
   }

   // Restored original synthetic constructor delegation: (I[BLcom/aspose/slides/internal/x6/n5$1;)V -> (I[B)V
   n5(int recoveredArg0, byte[] recoveredArg1, com.aspose.slides.internal.x6.n5$1 recoveredArg2) {
      this(recoveredArg0, recoveredArg1);
   }
}
