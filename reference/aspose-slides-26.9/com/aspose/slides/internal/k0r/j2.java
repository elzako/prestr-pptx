package com.aspose.slides.internal.k0r;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.Collections.Generic.List$Enumerator;
import com.aspose.slides.ms.System.IDisposable;

public class j2 extends e6r {
   private final List<w6> n5 = new List<>();

   public j2() {
      this.w1().n5(6002);
   }

   @Override
   protected void n5(com.aspose.slides.internal.z0k.n5 var1) {
      byte var2 = 0;

      while (var2 < this.w1().a6()) {
         long var3 = var1.c4() & 4294967295L;
         long var5 = var3 & 1048575L & 4294967295L;
         int var7 = (int)(var3 >> 20);
         var2 += 4;

         for (int var8 = 0; var8 < var7 && var2 < this.w1().a6(); var5++) {
            long var9 = var1.c4();
            this.n5.addItem(new w6(var5, var9));
            var2 += 4;
            var8++;
         }
      }
   }

   public final long n5(List<e6r> var1) {
      long var2 = 0L;
      long var4 = 0L;
      this.n5.clear();

      for (int var6 = 0; var6 < var1.size(); var6++) {
         if ((((e6r)var1.get_Item(var6)).r4() & 65535) != 6002 && (((e6r)var1.get_Item(var6)).r4() & 65535) != 4085) {
            var4 = ((m4)var1.get_Item(var6)).c8();
            this.n5.addItem(new w6(var4, var2));
            var2 = (var2 & 4294967295L) + (((e6r)var1.get_Item(var6)).n5() + 8 & 4294967295L) & 4294967295L;
         }
      }

      return var4;
   }

   public final List<w6> l6() {
      return this.n5;
   }

   public final w6 n5(long var1) {
      List$Enumerator var3 = this.n5.iterator();

      try {
         while (var3.hasNext()) {
            w6 var4 = (w6)var3.next();
            if (var4.n5() == var1) {
               return var4;
            }
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var3, IDisposable.class)) {
            var3.dispose();
         }
      }

      return null;
   }

   public final void l6(long var1) {
      for (int var3 = 0; var3 < this.n5.size(); var3++) {
         if (this.n5.get_Item(var3).n5() == var1) {
            this.n5.removeAt(var3);
            return;
         }
      }
   }

   @Override
   public void n5(com.aspose.slides.internal.z0k.l6 var1) {
      if (this.n5.size() > 0) {
         long var2 = (this.n5.get_Item(0).n5() & 4294967295L) - 1L & 4294967295L;
         long var4 = 0L;
         List var6 = new List();
         List$Enumerator var7 = this.n5.iterator();

         try {
            while (var7.hasNext()) {
               w6 var8 = (w6)var7.next();
               var4 = var8.n5();
               if ((var4 & 4294967295L) > ((var2 & 4294967295L) + 1L & 4294967295L) && var6.size() > 0) {
                  var1.n5((var6.size() << 20 & 4294967295L | ((var2 & 4294967295L) - var6.size() & 4294967295L) + 1L & 4294967295L) & 4294967295L);

                  for (int var9 = 0; var9 < var6.size(); var9++) {
                     var1.n5((Long)var6.get_Item(var9));
                  }

                  var6.clear();
               }

               var6.addItem(var8.l6());
               var2 = var4;
            }
         } finally {
            if (com.aspose.slides.internal.v6g.k5.n5(var7, IDisposable.class)) {
               var7.dispose();
            }
         }

         if (var6.size() > 0) {
            var1.n5((var6.size() << 20 & 4294967295L | ((var2 & 4294967295L) - var6.size() & 4294967295L) + 1L & 4294967295L) & 4294967295L);
            List$Enumerator var21 = var6.iterator();

            try {
               while (var21.hasNext()) {
                  long var11 = com.aspose.slides.internal.v6g.k5.u3(var21.next(), long.class);
                  var1.n5(var11);
               }
            } finally {
               if (com.aspose.slides.internal.v6g.k5.n5(var21, IDisposable.class)) {
                  var21.dispose();
               }
            }
         }
      }
   }

   @Override
   public int n5() {
      int var1 = 0;
      if (this.n5.size() > 0) {
         long var2 = (this.n5.get_Item(0).n5() & 4294967295L) - 1L & 4294967295L;
         int var4 = 0;
         List$Enumerator var5 = this.n5.iterator();

         try {
            while (var5.hasNext()) {
               w6 var6 = (w6)var5.next();
               long var7 = var6.n5();
               if ((var7 & 4294967295L) > ((var2 & 4294967295L) + 1L & 4294967295L) && var4 > 0) {
                  var1 += (var4 + 1) * 4;
                  var4 = 0;
               }

               var4++;
               var2 = var7;
            }
         } finally {
            if (com.aspose.slides.internal.v6g.k5.n5(var5, IDisposable.class)) {
               var5.dispose();
            }
         }

         if (var4 > 0) {
            var1 += (var4 + 1) * 4;
         }
      }

      return var1;
   }
}
