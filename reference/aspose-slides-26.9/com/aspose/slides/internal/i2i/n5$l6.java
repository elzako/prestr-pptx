package com.aspose.slides.internal.i2i;

import com.aspose.slides.exceptions.ArgumentException;

public class n5$l6 {
   private byte n5 = 0;
   private n5$n5 l6;
   private n5$n5 k5;
   private byte[] u3;

   public n5$l6() {
   }

   public n5$l6(com.aspose.slides.internal.x8w.l6 var1) {
      this();
      if (var1.l6() != 48 || var1.n5() < 2) {
         throw new ArgumentException("Invalid EncryptedData");
      }

      if (var1.n5(0).l6() != 2) {
         throw new ArgumentException("Invalid version");
      }

      this.n5 = var1.n5(0).u3()[0];
      com.aspose.slides.internal.x8w.l6 var2 = var1.n5(1);
      if (var2.l6() != 48) {
         throw new ArgumentException("missing EncryptedContentInfo");
      }

      com.aspose.slides.internal.x8w.l6 var3 = var2.n5(0);
      if (var3.l6() != 6) {
         throw new ArgumentException("missing EncryptedContentInfo.ContentType");
      }

      this.l6 = new n5$n5(com.aspose.slides.internal.x8w.k5.l6(var3));
      com.aspose.slides.internal.x8w.l6 var4 = var2.n5(1);
      if (var4.l6() != 48) {
         throw new ArgumentException("missing EncryptedContentInfo.ContentEncryptionAlgorithmIdentifier");
      }

      this.k5 = new n5$n5(com.aspose.slides.internal.x8w.k5.l6(var4.n5(0)));
      this.k5.n5(var4.n5(1));
      com.aspose.slides.internal.x8w.l6 var5 = var2.n5(2);
      if ((var5.l6() & 255) != 128) {
         throw new ArgumentException("missing EncryptedContentInfo.EncryptedContent");
      }

      this.u3 = var5.u3();
   }

   public n5$n5 n5() {
      return this.k5;
   }

   public byte[] l6() {
      return this.u3 == null ? null : (byte[])this.u3.clone();
   }
}
