package com.aspose.slides.internal.f3c;

import com.aspose.slides.exceptions.ArgumentException;
import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.exceptions.CryptographicException;
import com.aspose.slides.exceptions.NullReferenceException;
import com.aspose.slides.internal.l7h.a5;
import com.aspose.slides.internal.o8m.t1;
import com.aspose.slides.internal.o8m.u6;
import com.aspose.slides.ms.System.d1;
import com.aspose.slides.ms.System.p8;

public final class z3 extends m1 {
   private t1 k5;
   private int u3;
   private static final com.aspose.slides.internal.v6g.u9 a6 = new com.aspose.slides.internal.v6g.u9("1.3.6.1.5.5.7.3.1");

   public z3() {
      this.n5 = new u6("2.5.29.37", "Enhanced Key Usage");
   }

   public z3(com.aspose.slides.internal.o8m.u3 var1, boolean var2) {
      if (var1 == null) {
         throw new NullReferenceException();
      }

      this.n5 = new u6("2.5.29.37", "Enhanced Key Usage");
      this.l6 = var1.l6();
      super.s7(var2);
      this.u3 = this.l6(this.l6());
   }

   @Override
   public void n5(com.aspose.slides.internal.o8m.u3 var1) {
      if (var1 == null) {
         throw new ArgumentNullException("encodedData");
      }

      m1 var2 = com.aspose.slides.internal.v6g.k5.n5(var1, m1.class);
      if (var2 == null) {
         throw new ArgumentException(d1.n5("Wrong type.", new Object[]{}), "asnEncodedData");
      }

      if (var2.n5 == null) {
         this.n5 = new u6("2.5.29.37", "Enhanced Key Usage");
      } else {
         this.n5 = new u6(var2.n5);
      }

      this.n5(var2.l6());
      super.s7(var2.u9());
      this.u3 = this.l6(this.l6());
   }

   public int l6(byte[] var1) {
      if (var1 != null && var1.length != 0) {
         if (com.aspose.slides.internal.v6g.k5.u3(var1[0], 6) != 48) {
            return 2;
         }

         if (this.k5 == null) {
            this.k5 = new t1();
         }

         try {
            com.aspose.slides.internal.x8w.l6 var2 = new com.aspose.slides.internal.x8w.l6(var1);
            if (com.aspose.slides.internal.v6g.k5.u3(var2.l6(), 6) != 48) {
               throw new CryptographicException(d1.n5("Invalid ASN.1 Tag", new Object[]{}));
            }

            for (int var3 = 0; var3 < var2.n5(); var3++) {
               this.k5.n5(new u6(com.aspose.slides.internal.x8w.k5.l6(var2.n5(var3))));
            }

            return 0;
         } catch (RuntimeException var4) {
            return 1;
         }
      } else {
         return 1;
      }
   }

   @Override
   public String l6(boolean var1) {
      switch (this.u3) {
         case 1:
            return d1.n5;
         case 2:
         case 3:
            return this.k5(this.l6);
         case 4:
            return "Information Not Available";
         default:
            if (!"2.5.29.37".equals(this.n5.l6())) {
               return d1.n5("Unknown Key Usage ({0})", new Object[]{this.n5.l6()});
            } else if (this.k5.size() == 0) {
               return "Information Not Available";
            } else {
               a5 var2 = new a5();

               for (int var3 = 0; var3 < this.k5.size(); var3++) {
                  u6 var4 = this.k5.n5(var3);
                  switch (a6.n5(var4.l6())) {
                     case 0:
                        var2.n5("Server Authentication (");
                        break;
                     default:
                        var2.n5("Unknown Key Usage (");
                  }

                  var2.n5(var4.l6());
                  var2.n5(")");
                  if (var1) {
                     var2.n5(p8.k5());
                  } else if (var3 != this.k5.size() - 1) {
                     var2.n5(", ");
                  }
               }

               return var2.toString();
            }
      }
   }
}
