package com.aspose.slides.internal.l6z;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.Collections.Generic.List$Enumerator;
import com.aspose.slides.exceptions.InvalidOperationException;
import com.aspose.slides.ms.System.IDisposable;

class a6 extends n1 {
   private byte[] n5;
   private final long l6;
   private List<i9> k5 = new List<>();
   private final boolean u3;

   public a6(long var1, boolean var3) {
      this.l6 = var1;
      this.u3 = var3;
   }

   @Override
   void n5(com.aspose.slides.internal.z0k.n5 var1) {
      this.n5 = var1.c8((int)this.l6 - 2);
      if (this.u3) {
         this.k5();
      }
   }

   @Override
   void n5(com.aspose.slides.internal.z0k.l6 var1) {
      if (this.u3) {
         List$Enumerator var2 = this.k5.iterator();

         try {
            while (var2.hasNext()) {
               i9 var3 = (i9)var2.next();
               var3.n5(var1);
            }
         } finally {
            if (com.aspose.slides.internal.v6g.k5.n5(var2, IDisposable.class)) {
               var2.dispose();
            }
         }
      } else {
         var1.n5(this.n5);
      }
   }

   public final byte[] n5() {
      return this.n5;
   }

   public final List<i9> l6() {
      if (!this.u3) {
         throw new InvalidOperationException();
      } else {
         return this.k5;
      }
   }

   public final void n5(List<i9> var1) {
      if (!this.u3) {
         throw new InvalidOperationException();
      }

      this.k5 = var1;
   }

   private void k5() {
      com.aspose.slides.internal.z0k.e2 var1 = new com.aspose.slides.internal.z0k.e2(this.n5);

      try {
         com.aspose.slides.internal.z0k.n5 var2 = new com.aspose.slides.internal.z0k.n5(var1);

         try {
            while (var2.x8().getPosition() != var2.x8().getLength()) {
               i9 var3 = new i9();
               var3.n5(var2);
               this.k5.addItem(var3);
            }
         } finally {
            if (var2 != null) {
               var2.dispose();
            }
         }
      } finally {
         if (var1 != null) {
            var1.dispose();
         }
      }
   }
}
