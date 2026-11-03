package com.aspose.slides.internal.l6z;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.Collections.Generic.List$Enumerator;
import com.aspose.slides.exceptions.ArgumentException;
import com.aspose.slides.ms.System.IDisposable;

public class b3 extends j3 {
   private final int n5;
   private long l6;
   private int k5;
   private a0 u3 = new a0();
   private final List<e2> a6 = new List<>();

   b3(int var1) {
      this.n5 = var1;
   }

   @Override
   public int n5() {
      return 15;
   }

   @Override
   protected void l6(com.aspose.slides.internal.z0k.n5 var1) {
      this.l6 = var1.c4();
      this.k5 = var1.r4();
      this.u3.n5(var1);

      while ((com.aspose.slides.internal.l6z.n5.n5(var1) & 65535) == 25) {
         e2 var2 = new e2(this.n5);
         var2.n5(var1);
         this.a6.addItem(var2);
      }
   }

   @Override
   protected void l6(com.aspose.slides.internal.z0k.l6 var1) {
      var1.n5(2L);
      var1.n5(this.a6.size() & 65535);
      this.u3.n5(var1);
      List$Enumerator var2 = this.a6.iterator();

      try {
         while (var2.hasNext()) {
            e2 var3 = (e2)var2.next();
            var3.n5(var1);
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var2, IDisposable.class)) {
            var2.dispose();
         }
      }
   }

   public final List<e2> l6() {
      return this.a6;
   }

   final void n5(String var1) {
      e2 var2 = this.l6(var1);
      if (var2 == null) {
         throw new ArgumentException(com.aspose.slides.ms.System.d1.n5("Module with name {0} is not exists", new Object[]{var1}));
      }

      this.a6.removeItem(var2);
   }

   private e2 l6(String var1) {
      return this.a6.find(new b3$1(this, var1));
   }
}
