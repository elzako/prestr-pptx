package com.aspose.slides.internal.g7;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.Collections.Generic.List$Enumerator;
import com.aspose.slides.exceptions.ArgumentException;
import com.aspose.slides.ms.System.IDisposable;

public class h3d extends f1s {
   private List<u6p> l6 = new List<>();

   public h3d(long var1) {
      super(var1);
   }

   public final u6p n5(int var1) {
      return this.l6.get_Item(var1);
   }

   public final u6p n5(String var1) {
      if (var1.length() != 4) {
         throw new ArgumentException("parameter string Name have length 4 characters");
      }

      List$Enumerator var2 = this.l6.iterator();

      try {
         while (var2.hasNext()) {
            u6p var3 = (u6p)var2.next();
            if (com.aspose.slides.ms.System.d1.a6(var3.l6(), var1)) {
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

   @Override
   public void n5(f3c var1) {
      var1.n5(this.n5 & 4294967295L);
      int var2 = var1.n3();
      List var3 = new List(var2 & 65535);

      for (int var4 = 0; var4 < (var2 & 65535); var4++) {
         h3d$n5 var5 = new h3d$n5(null);
         var5.n5 = var1.l6(4);
         var5.l6 = var1.n3();
         var3.addItem(var5);
      }

      this.l6.setCapacity(var2 & 65535);

      for (int var6 = 0; var6 < (var2 & 65535); var6++) {
         this.l6
            .addItem(
               f1s.n5(new u6p((this.n5 & 4294967295L) + (((h3d$n5)var3.get_Item(var6)).l6 & 65535) & 4294967295L, ((h3d$n5)var3.get_Item(var6)).n5), var1)
            );
      }
   }
}
