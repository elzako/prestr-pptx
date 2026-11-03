package com.aspose.slides.internal.f3c;

import com.aspose.slides.exceptions.ArgumentException;
import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.exceptions.CryptographicException;
import com.aspose.slides.exceptions.NullReferenceException;
import com.aspose.slides.internal.l7h.a5;
import com.aspose.slides.internal.o8m.u6;
import com.aspose.slides.ms.System.d1;
import com.aspose.slides.ms.System.p8;

public final class w1 extends m1 {
   private byte[] k5;
   private String u3;
   private int a6;

   public w1() {
      this.n5 = new u6("2.5.29.14", "Subject Key Identifier");
   }

   public w1(com.aspose.slides.internal.o8m.u3 var1, boolean var2) {
      if (var1 == null) {
         throw new NullReferenceException();
      }

      this.n5 = new u6("2.5.29.14", "Subject Key Identifier");
      this.l6 = var1.l6();
      super.s7(var2);
      this.a6 = this.l6(this.l6());
   }

   public String k5() {
      switch (this.a6) {
         case 0:
         case 4:
            if (this.k5 != null) {
               this.u3 = com.aspose.slides.internal.x8w.n3.n5(this.k5);
            }

            return this.u3;
         default:
            throw new CryptographicException("Badly encoded extension.");
      }
   }

   @Override
   public void n5(com.aspose.slides.internal.o8m.u3 var1) {
      if (var1 == null) {
         throw new ArgumentNullException("encodedData");
      }

      m1 var2 = com.aspose.slides.internal.v6g.k5.n5(var1, m1.class);
      if (var2 == null) {
         throw new ArgumentException(d1.n5("Wrong type.", new Object[]{}), "encodedData");
      }

      if (var2.n5 == null) {
         this.n5 = new u6("2.5.29.14", "Subject Key Identifier");
      } else {
         this.n5 = new u6(var2.n5);
      }

      this.n5(var2.l6());
      super.s7(var2.u9());
      this.a6 = this.l6(this.l6());
   }

   public int l6(byte[] var1) {
      if (var1 != null && var1.length != 0) {
         this.u3 = d1.n5;
         if (com.aspose.slides.internal.v6g.k5.u3(var1[0], 6) != 4) {
            return 2;
         }

         if (var1.length == 2) {
            return 4;
         }

         if (var1.length < 3) {
            return 3;
         }

         try {
            com.aspose.slides.internal.x8w.l6 var2 = new com.aspose.slides.internal.x8w.l6(var1);
            this.k5 = var2.u3();
            return 0;
         } catch (RuntimeException var3) {
            return 1;
         }
      } else {
         return 1;
      }
   }

   @Override
   public String l6(boolean var1) {
      switch (this.a6) {
         case 1:
            return d1.n5;
         case 2:
         case 3:
            return this.k5(this.l6);
         case 4:
            return "Information Not Available";
         default:
            if (!"2.5.29.14".equals(this.n5.l6())) {
               return d1.n5("Unknown Key Usage ({0})", new Object[]{this.n5.l6()});
            } else {
               a5 var2 = new a5();

               for (int var3 = 0; var3 < this.k5.length; var3++) {
                  var2.n5(com.aspose.slides.ms.System.e2.n5(this.k5[var3], "x2"));
                  if (var3 != this.k5.length - 1) {
                     var2.n5(" ");
                  }
               }

               if (var1) {
                  var2.n5(p8.k5());
               }

               return var2.toString();
            }
      }
   }
}
