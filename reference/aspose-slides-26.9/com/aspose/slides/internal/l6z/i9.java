package com.aspose.slides.internal.l6z;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.Collections.Generic.List$Enumerator;
import com.aspose.slides.ms.System.IDisposable;

class i9 extends n1 {
   private byte n5;
   private final List<j4> l6 = new List<>();

   @Override
   void n5(com.aspose.slides.internal.z0k.n5 var1) {
      this.n5 = var1.z1();
      this.l6(var1);
   }

   @Override
   void n5(com.aspose.slides.internal.z0k.l6 var1) {
      var1.n5(this.n5);
      this.l6(var1);
   }

   public final byte n5() {
      return this.n5;
   }

   public final void n5(byte var1) {
      this.n5 = var1;
   }

   public final List<j4> l6() {
      return this.l6;
   }

   private void l6(com.aspose.slides.internal.z0k.n5 var1) {
      for (int var2 = 0; var2 < 8 && var1.x8().getPosition() != var1.x8().getLength(); var2++) {
         boolean var3 = ((this.n5 & 255) >> var2 & 1) == 0;
         if (var3) {
            y4 var4 = new y4();
            var4.n5(var1);
            this.l6.addItem(var4);
         } else {
            c8 var5 = new c8();
            var5.n5(var1);
            this.l6.addItem(var5);
         }
      }
   }

   private void l6(com.aspose.slides.internal.z0k.l6 var1) {
      List$Enumerator var2 = this.l6.iterator();

      try {
         while (var2.hasNext()) {
            j4 var3 = (j4)var2.next();
            var3.n5(var1);
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var2, IDisposable.class)) {
            var2.dispose();
         }
      }
   }
}
