package com.aspose.slides.internal.i2i;

import com.aspose.slides.exceptions.ArgumentException;

public class n5$n5 {
   private String n5;
   private com.aspose.slides.internal.x8w.l6 l6;

   public n5$n5() {
      this.l6 = new com.aspose.slides.internal.x8w.l6((byte)-96);
   }

   public n5$n5(String var1) {
      this();
      this.n5 = var1;
   }

   public n5$n5(byte[] var1) {
      this(new com.aspose.slides.internal.x8w.l6(var1));
   }

   public n5$n5(com.aspose.slides.internal.x8w.l6 var1) {
      if (var1.l6() == 48 && (var1.n5() >= 1 || var1.n5() <= 2)) {
         if (var1.n5(0).l6() != 6) {
            throw new ArgumentException("Invalid contentType");
         }

         this.n5 = com.aspose.slides.internal.x8w.k5.l6(var1.n5(0));
         if (var1.n5() > 1) {
            if ((var1.n5(1).l6() & 255) != 160) {
               throw new ArgumentException("Invalid content");
            }

            this.l6 = var1.n5(1);
         }
      } else {
         throw new ArgumentException("Invalid ASN1");
      }
   }

   public com.aspose.slides.internal.x8w.l6 n5() {
      return this.u3();
   }

   public com.aspose.slides.internal.x8w.l6 l6() {
      return this.l6;
   }

   public void n5(com.aspose.slides.internal.x8w.l6 var1) {
      this.l6 = var1;
   }

   public String k5() {
      return this.n5;
   }

   public void n5(String var1) {
      this.n5 = var1;
   }

   com.aspose.slides.internal.x8w.l6 u3() {
      com.aspose.slides.internal.x8w.l6 var1 = new com.aspose.slides.internal.x8w.l6((byte)48);
      var1.n5(com.aspose.slides.internal.x8w.k5.n5(this.n5));
      if (this.l6 != null && this.l6.n5() > 0) {
         var1.n5(this.l6);
      }

      return var1;
   }
}
