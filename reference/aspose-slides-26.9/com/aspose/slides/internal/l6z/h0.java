package com.aspose.slides.internal.l6z;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.Collections.Generic.List$Enumerator;
import com.aspose.slides.exceptions.InvalidOperationException;
import com.aspose.slides.ms.System.IDisposable;

class h0 extends n1 {
   private byte n5;
   private final List<u3> l6 = new List<>();

   @Override
   void n5(com.aspose.slides.internal.z0k.n5 var1) {
      this.n5 = var1.z1();
      this.l6(var1);
   }

   @Override
   void n5(com.aspose.slides.internal.z0k.l6 var1) {
      var1.n5((byte)1);
      this.l6(var1);
   }

   private void l6(com.aspose.slides.internal.z0k.n5 var1) {
      if ((this.n5 & 255) != 1) {
         throw new InvalidOperationException();
      }

      u3 var2;
      do {
         var2 = new u3();
         var2.n5(var1);
         this.l6.addItem(var2);
      } while (this.n5(var1, var2));
   }

   private boolean n5(com.aspose.slides.internal.z0k.n5 var1, u3 var2) {
      return (var2.n5().n5() & 4294967295L) == 4095L && var1.x8().getPosition() != var1.x8().getLength() || var1.x8().getPosition() < var1.x8().getLength();
   }

   private void l6(com.aspose.slides.internal.z0k.l6 var1) {
      List$Enumerator var2 = this.l6.iterator();

      try {
         while (var2.hasNext()) {
            u3 var3 = (u3)var2.next();
            var3.n5(var1);
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var2, IDisposable.class)) {
            var2.dispose();
         }
      }
   }

   public final void n5(byte var1) {
      this.n5 = var1;
   }

   public final List<u3> n5() {
      return this.l6;
   }
}
