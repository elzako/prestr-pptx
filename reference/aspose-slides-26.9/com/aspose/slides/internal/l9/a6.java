package com.aspose.slides.internal.l9;

import com.aspose.slides.internal.e7.s7;
import com.aspose.slides.internal.j9e.x8;
import com.aspose.slides.internal.o9b.t4;
import com.aspose.slides.internal.z0k.e2;

public class a6 extends u3 {
   private com.aspose.slides.internal.o9b.l6 n5;
   private byte[] l6;
   private static final x8 k5 = x8.c8();

   public a6(s7 var1) {
      super(var1, "jpg");
   }

   @Override
   public com.aspose.slides.internal.o9b.l6 n5() {
      if (this.n5 != null) {
         return this.n5;
      }

      try {
         s7 var1 = this.t9();
         this.l6 = var1.n5();
         if (this.l6.length == 0) {
            return null;
         }

         e2 var2 = new e2(this.l6);

         try {
            t4 var3 = t4.n5(var2);

            try {
               if (var3 != null) {
                  e2 var4 = new e2();

                  try {
                     var3.n5(var4, k5);
                     this.n5 = new com.aspose.slides.internal.o9b.l6(var3);
                  } finally {
                     if (var4 != null) {
                        var4.dispose();
                     }
                  }
               }
            } finally {
               if (var3 != null) {
                  var3.dispose();
               }
            }
         } finally {
            if (var2 != null) {
               var2.dispose();
            }
         }

         return this.n5;
      } catch (RuntimeException var23) {
         return null;
      }
   }

   @Override
   public void n5(com.aspose.slides.internal.z0k.t4 var1) {
      this.n5();
      if (this.n5 != null) {
         this.n5.n5(var1, k5);
      }
   }
}
