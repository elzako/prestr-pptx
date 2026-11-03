package com.aspose.slides.internal.x6;

import com.aspose.slides.Collections.Generic.Dictionary;
import com.aspose.slides.Collections.Generic.Dictionary$KeyCollection$Enumerator;
import com.aspose.slides.Collections.Generic.Dictionary$ValueCollection$Enumerator;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.Collections.Generic.List$Enumerator;
import com.aspose.slides.exceptions.Exception;
import com.aspose.slides.exceptions.IOException;
import com.aspose.slides.internal.l7.h0$n5;
import com.aspose.slides.internal.m9.c8;
import com.aspose.slides.internal.m9.h0;
import com.aspose.slides.internal.q5.a6$n5;
import com.aspose.slides.internal.q5.c8$n5;
import com.aspose.slides.internal.q5.u3$n5;
import com.aspose.slides.internal.q5.u9$n5;
import com.aspose.slides.internal.z0k.m3;
import com.aspose.slides.ms.System.IDisposable;

public class n5$n5 {
   private Dictionary<Integer, h0$n5> n5;
   private l6 l6;
   private int k5 = com.aspose.slides.internal.x6.n5.n5;
   private int u3;
   private int a6;
   private int u9;
   private int h0;
   private Dictionary<com.aspose.slides.internal.l7.u3, c8> c8;
   private byte[] t2;

   private n5$n5(l6 var1) {
      this.l6 = var1;
      this.n5 = new Dictionary<>();
   }

   private void n5(m3 var1) {
      if (var1 == null) {
         throw new IOException("No input stream for font.");
      }

      com.aspose.slides.internal.m9.k5 var2 = null;

      try {
         var2 = new com.aspose.slides.internal.m9.k5(var1);
         List var3 = this.n5(var2);
         this.c8 = n5(var3, var2);
         this.n5 = n5(this.c8);
      } finally {
         var2.n5().u3();
      }
   }

   private void n5(c8 var1, int var2) {
      if (var1 == null) {
         throw new IOException("No data for font.");
      }

      List var3 = this.n5((h0)var1, var2);
      this.c8 = n5(var3, var1);
      this.n5 = n5(this.c8);
   }

   public static n5$n5 n5(l6 var0, m3 var1) {
      n5$n5 var2 = new n5$n5(var0);
      var2.n5(var1);
      return var2;
   }

   public static n5$n5 n5(l6 var0, c8 var1, int var2) {
      n5$n5 var3 = new n5$n5(var0);
      var3.n5(var1, var2);
      return var3;
   }

   public final n5 n5() {
      Dictionary var1 = null;
      n5 var2 = new n5(this.k5, this.t2, null);
      if (this.n5.size() > 0) {
         var1 = n5(var2, this.n5);
      }

      com.aspose.slides.internal.x6.n5.n5(var2, var1);
      this.n5 = null;
      this.c8 = null;
      return var2;
   }

   private static Dictionary<Integer, h0$n5> n5(Dictionary<com.aspose.slides.internal.l7.u3, c8> var0) {
      Dictionary var1 = new Dictionary();
      Dictionary$KeyCollection$Enumerator var2 = var0.getKeys().iterator();

      try {
         while (var2.hasNext()) {
            com.aspose.slides.internal.l7.u3 var3 = (com.aspose.slides.internal.l7.u3)var2.next();
            h0$n5 var4 = n5(var3, (c8)var0.get_Item(var3));
            var1.addItem(var3.n5(), var4);
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var2, IDisposable.class)) {
            var2.dispose();
         }
      }

      l6(var1);
      return var1;
   }

   private static h0$n5 n5(com.aspose.slides.internal.l7.u3 var0, c8 var1) {
      return h0$n5.l6(var0, var1);
   }

   private static Dictionary<Integer, com.aspose.slides.internal.l7.h0> n5(n5 var0, Dictionary<Integer, h0$n5> var1) {
      Dictionary var2 = new Dictionary();
      l6(var1);
      long var3 = 0L;
      boolean var5 = false;
      u3$n5 var6 = null;
      Dictionary$ValueCollection$Enumerator var7 = var1.getValues().iterator();

      try {
         while (var7.hasNext()) {
            h0$n5 var8 = (h0$n5)var7.next();
            com.aspose.slides.internal.l7.h0 var9 = null;
            if (com.aspose.slides.internal.x6.k5.k5(var8.y4().n5())) {
               var6 = (u3$n5)var8;
            } else {
               if (var8.l6()) {
                  var5 |= var8.a6();
                  var9 = (com.aspose.slides.internal.l7.h0)var8.n5();
               }

               if (var9 == null) {
                  throw new Exception("Unable to build table - " + var8);
               }

               long var10 = var9.k5();
               var3 += var10;
               var2.addItem(var9.u3().n5(), var9);
            }
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var7, IDisposable.class)) {
            var7.dispose();
         }
      }

      com.aspose.slides.internal.l7.h0 var16 = null;
      if (var6 != null) {
         if (var5) {
            var6.n5(var3);
         }

         if (var6.l6()) {
            var5 |= var6.a6();
            var16 = (com.aspose.slides.internal.l7.h0)var6.n5();
         }

         if (var16 == null) {
            throw new Exception("Unable to build table - " + var6);
         }

         var3 += var16.k5();
         var2.addItem(var16.u3().n5(), var16);
      }

      com.aspose.slides.internal.x6.n5.n5(var0, var3 & 4294967295L);
      return var2;
   }

   private static void l6(Dictionary<Integer, h0$n5> var0) {
      h0$n5 var1 = null;
      h0$n5[] var2 = new h0$n5[]{var1};
      u3$n5 var3 = var0.tryGetValue(com.aspose.slides.internal.x6.k5.k5, var2) ? (u3$n5)var2[0] : null;
      var1 = var2[0];
      var2[0] = var1;
      u9$n5 var4 = var0.tryGetValue(com.aspose.slides.internal.x6.k5.u3, var2) ? (u9$n5)var2[0] : null;
      var1 = var2[0];
      var2[0] = var1;
      c8$n5 var5 = var0.tryGetValue(com.aspose.slides.internal.x6.k5.u9, var2) ? (c8$n5)var2[0] : null;
      var1 = var2[0];
      var2[0] = var1;
      com.aspose.slides.internal.e4.h0$n5 var6 = var0.tryGetValue(com.aspose.slides.internal.x6.k5.y4, var2)
         ? (com.aspose.slides.internal.e4.h0$n5)var2[0]
         : null;
      var1 = var2[0];
      var2[0] = var1;
      com.aspose.slides.internal.q5.h0$n5 var7 = var0.tryGetValue(com.aspose.slides.internal.x6.k5.a6, var2)
         ? (com.aspose.slides.internal.q5.h0$n5)var2[0]
         : null;
      var1 = var2[0];
      var2[0] = var1;
      a6$n5 var8 = var0.tryGetValue(com.aspose.slides.internal.x6.k5.c4, var2) ? (a6$n5)var2[0] : null;
      var1 = var2[0];
      if (var7 != null) {
         if (var5 != null) {
            var7.l6(var5.t9());
         }

         if (var4 != null) {
            var7.n5(var4.t9());
         }
      }

      if (var6 != null) {
         if (var5 != null) {
            var6.l6(var5.t9());
         }

         if (var3 != null) {
            var6.n5(var3.t9());
         }
      }

      if (var8 != null && var5 != null) {
         var8.n5(var5.t9());
      }
   }

   private List<com.aspose.slides.internal.l7.u3> n5(com.aspose.slides.internal.m9.k5 var1) {
      List var2 = new List();
      this.k5 = var1.c8();
      this.u3 = var1.u3();
      this.a6 = var1.u3();
      this.u9 = var1.u3();
      this.h0 = var1.u3();

      for (int var3 = 0; var3 < this.u3; var3++) {
         int var4 = var1.u9();
         long var5 = var1.a6();
         int var7 = var1.u9();
         int var8 = var1.u9();
         com.aspose.slides.internal.l7.u3 var9 = new com.aspose.slides.internal.l7.u3(var4, var5, var7, var8);
         var2.addItem(var9);
      }

      var2.sort(com.aspose.slides.internal.l7.u3.n5);
      return var2;
   }

   private static Dictionary<com.aspose.slides.internal.l7.u3, c8> n5(List<com.aspose.slides.internal.l7.u3> var0, com.aspose.slides.internal.m9.k5 var1) {
      Dictionary var2 = new Dictionary();
      List$Enumerator var3 = var0.iterator();

      try {
         while (var3.hasNext()) {
            com.aspose.slides.internal.l7.u3 var4 = (com.aspose.slides.internal.l7.u3)var3.next();
            var1.n5(var4.l6() - var1.k5());
            com.aspose.slides.internal.m9.k5 var5 = new com.aspose.slides.internal.m9.k5(var1.n5(), var4.k5());
            c8 var6 = com.aspose.slides.internal.m9.c8.n3(var4.k5());
            var6.n5(var5.n5(), var4.k5());
            var2.addItem(var4, var6);
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var3, IDisposable.class)) {
            var3.dispose();
         }
      }

      return var2;
   }

   private List<com.aspose.slides.internal.l7.u3> n5(h0 var1, int var2) {
      List var3 = new List();
      this.k5 = var1.s7(var2 + 0);
      this.u3 = var1.a6(var2 + 4);
      this.a6 = var1.a6(var2 + 6);
      this.u9 = var1.a6(var2 + 8);
      this.h0 = var1.a6(var2 + 10);
      int var4 = var2 + 12;

      for (int var5 = 0; var5 < this.u3; var4 += 16) {
         int var6 = var1.c8(var4 + 0);
         long var7 = var1.h0(var4 + 4);
         int var9 = var1.c8(var4 + 8);
         int var10 = var1.c8(var4 + 12);
         com.aspose.slides.internal.l7.u3 var11 = new com.aspose.slides.internal.l7.u3(var6, var7, var9, var10);
         var3.addItem(var11);
         var5++;
      }

      var3.sort(com.aspose.slides.internal.l7.u3.n5);
      return var3;
   }

   private static Dictionary<com.aspose.slides.internal.l7.u3, c8> n5(List<com.aspose.slides.internal.l7.u3> var0, c8 var1) {
      Dictionary var2 = new Dictionary(var0.size());
      List$Enumerator var3 = var0.iterator();

      try {
         while (var3.hasNext()) {
            com.aspose.slides.internal.l7.u3 var4 = (com.aspose.slides.internal.l7.u3)var3.next();
            c8 var5 = (c8)var1.k5(var4.l6(), var4.k5());
            var2.addItem(var4, var5);
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var3, IDisposable.class)) {
            var3.dispose();
         }
      }

      return var2;
   }
}
