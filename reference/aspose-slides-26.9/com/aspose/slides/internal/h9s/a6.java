package com.aspose.slides.internal.h9s;

import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.exceptions.ArgumentOutOfRangeException;
import com.aspose.slides.internal.d9r.u9;
import com.aspose.slides.ms.System.a3;
import com.aspose.slides.ms.System.d1;
import com.aspose.slides.ms.System.q1;

public class a6 {
   private final com.aspose.slides.internal.v6s.u3 n5;
   private final long l6;
   private final byte[] k5;
   private long u3;
   private long a6;

   public a6(com.aspose.slides.internal.v6s.u3 var1, long var2, long var4) {
      if (var1 == null) {
         throw new ArgumentNullException("stream");
      }

      if (var4 < 0L) {
         throw new ArgumentOutOfRangeException("bytesCount", "Must be positive number.");
      }

      this.n5 = var1;
      this.a6 = var2;
      if (var4 == 0L) {
         this.k5 = new byte[0];
      } else {
         this.k5 = u9.n5(0).n5((int)var4);
      }

      this.l6 = this.a6 + var4;
   }

   public final com.aspose.slides.internal.r1x.u9 n5() {
      byte var1 = 0;
      byte var2 = 0;
      String var3 = null;
      this.u3 = 0L;
      int var4 = (int)q1.k5(com.aspose.slides.ms.System.u3.n5((Object)(this.k5)).u9(), this.l6 - this.a6);
      if (var4 > 0) {
         long var5 = this.n5.n5(this.k5, 0, this.a6, var4);
         if (var5 > 0L) {
            this.a6 += var5;
            this.u3 = var5;
         } else if (this.l6 > this.n5.n5()) {
            var1 = 2;
            var2 = 1;
            var3 = d1.n5(new String[]{"Cannot read ", a3.l6(var4), " bytes from stream."});
         } else {
            var1 = 2;
            var3 = d1.n5(new String[]{"Cannot read ", a3.l6(var4), " bytes from stream."});
         }
      } else if (var4 == 0) {
         var1 = 1;
         var3 = "There is no more data to read.";
      }

      com.aspose.slides.internal.r1x.u9 var7 = new com.aspose.slides.internal.r1x.u9();
      var7.u3 = var3;
      var7.k5 = var1;
      var7.n5 = this.k5;
      var7.l6 = (int)this.u3;
      var7.a6 = var2;
      return var7;
   }
}
