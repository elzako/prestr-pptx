package com.aspose.slides.internal.k2s;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.Collections.Generic.List$Enumerator;
import com.aspose.slides.internal.f7k.c8;
import com.aspose.slides.internal.f7k.t2;
import com.aspose.slides.ms.System.IDisposable;
import com.aspose.slides.ms.System.d1;
import com.aspose.slides.ms.System.q1;

public class l6 {
   private com.aspose.slides.internal.f7k.n5 u3;
   private com.aspose.slides.internal.f7k.l6 a6;
   private t2 u9;
   public List<com.aspose.slides.internal.f7k.u9> n5 = new List<>();
   public List<c8> l6 = new List<>();
   public List<c8> k5 = new List<>();

   public final void n5(com.aspose.slides.internal.f7k.n5 var1) {
      this.u3 = var1;
   }

   public final com.aspose.slides.internal.f7k.l6 n5() {
      return this.a6;
   }

   public final void n5(com.aspose.slides.internal.f7k.l6 var1) {
      this.a6 = var1;
   }

   public final t2 l6() {
      return this.u9;
   }

   public final void n5(t2 var1) {
      this.u9 = var1;
   }

   public final com.aspose.slides.internal.f7k.u9 n5(String var1) {
      List$Enumerator var2 = this.n5.iterator();

      try {
         while (var2.hasNext()) {
            com.aspose.slides.internal.f7k.u9 var3 = (com.aspose.slides.internal.f7k.u9)var2.next();
            if (d1.a6(var3.a0(), var1)) {
               return var3;
            }
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var2, IDisposable.class)) {
            var2.dispose();
         }
      }

      return null;
   }

   public final c8 n5(com.aspose.slides.internal.f7k.u9 var1, com.aspose.slides.internal.f7k.u9 var2) {
      if (var1 != null && var2 != null) {
         List$Enumerator var3 = this.l6.iterator();

         try {
            while (var3.hasNext()) {
               c8 var4 = (c8)var3.next();
               if (d1.a6(var4.a0(), var1.d2()) && d1.a6(var4.d2(), var2.d2())) {
                  return var4;
               }
            }
         } finally {
            if (com.aspose.slides.internal.v6g.k5.n5(var3, IDisposable.class)) {
               var3.dispose();
            }
         }

         return null;
      } else {
         return null;
      }
   }

   public static List<l6> n5(List<l6> var0, boolean var1) {
      List var2 = new List();
      if (var1) {
         List$Enumerator var3 = var0.iterator();

         try {
            while (var3.hasNext()) {
               l6 var4 = (l6)var3.next();
               if (var4.n5().d5()) {
                  var2.addItem(var4);
               }
            }
         } finally {
            if (com.aspose.slides.internal.v6g.k5.n5(var3, IDisposable.class)) {
               var3.dispose();
            }
         }

         if (var2.size() == 0) {
            var2.addRange(var0);
         }
      } else {
         List$Enumerator var13 = var0.iterator();

         try {
            while (var13.hasNext()) {
               l6 var14 = (l6)var13.next();
               if (!var14.n5().d5()) {
                  var2.addItem(var14);
               }
            }
         } finally {
            if (com.aspose.slides.internal.v6g.k5.n5(var13, IDisposable.class)) {
               var13.dispose();
            }
         }
      }

      return var2;
   }

   public static List<l6> l6(List<l6> var0, boolean var1) {
      List var2 = new List();
      if (var1) {
         List$Enumerator var3 = var0.iterator();

         try {
            while (var3.hasNext()) {
               l6 var4 = (l6)var3.next();
               if (var4.n5().p8()) {
                  var2.addItem(var4);
               }
            }
         } finally {
            if (com.aspose.slides.internal.v6g.k5.n5(var3, IDisposable.class)) {
               var3.dispose();
            }
         }
      } else {
         List$Enumerator var13 = var0.iterator();

         try {
            while (var13.hasNext()) {
               l6 var14 = (l6)var13.next();
               if (!var14.n5().p8()) {
                  var2.addItem(var14);
               }
            }
         } finally {
            if (com.aspose.slides.internal.v6g.k5.n5(var13, IDisposable.class)) {
               var13.dispose();
            }
         }
      }

      return var2;
   }

   public static List<l6> n5(List<l6> var0, int var1) {
      List var2 = new List();
      int var3 = com.aspose.slides.internal.f7k.a6.l6(var1);
      int var4 = Integer.MAX_VALUE;
      List$Enumerator var5 = var0.iterator();

      try {
         while (var5.hasNext()) {
            l6 var6 = (l6)var5.next();
            boolean var7 = "all".equals(var6.n5().f2());
            byte var8 = 50;
            int var9 = var7 ? var3 - var8 : com.aspose.slides.internal.f7k.a6.l6(com.aspose.slides.internal.f7k.a6.n5(var6.n5().f2()));
            int var10 = var3 - var9;
            int var11 = q1.n5(var10);
            if (var4 > var11) {
               var2 = new List();
               var2.addItem(var6);
               var4 = var11;
            } else if (var4 == var11) {
               if (var10 <= var8) {
                  var2.addItem(var6);
               } else {
                  var2.insertItem(0, var6);
               }
            }
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var5, IDisposable.class)) {
            var5.dispose();
         }
      }

      return var2;
   }
}
