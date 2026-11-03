package com.aspose.slides.internal.k0r;

import com.aspose.slides.exceptions.Exception;

public final class w6 {
   private long n5;
   private long l6;
   private m4 k5;

   public w6(long var1, long var3) {
      this.n5 = var1;
      this.l6 = var3;
   }

   public long n5() {
      return this.n5;
   }

   public long l6() {
      return this.l6;
   }

   public void n5(m4 var1) {
      if (this.k5 != null) {
         throw new Exception("m_referencedRecord is assigned already.");
      }

      this.k5 = var1;
   }
}
