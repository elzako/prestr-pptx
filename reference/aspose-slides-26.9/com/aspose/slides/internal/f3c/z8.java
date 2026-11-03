package com.aspose.slides.internal.f3c;

import com.aspose.slides.exceptions.ArgumentException;
import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.exceptions.CryptographicException;
import com.aspose.slides.exceptions.NullReferenceException;
import com.aspose.slides.internal.l7h.a5;
import com.aspose.slides.internal.o8m.u6;
import com.aspose.slides.ms.System.d1;
import com.aspose.slides.ms.System.p8;

public final class z8 extends m1 {
   private int k5;
   private int u3;

   public z8() {
      this.n5 = new u6("2.5.29.15", "Key Usage");
   }

   public z8(com.aspose.slides.internal.o8m.u3 var1, boolean var2) {
      if (var1 == null) {
         throw new NullReferenceException();
      }

      this.n5 = new u6("2.5.29.15", "Key Usage");
      this.l6 = var1.l6();
      super.s7(var2);
      this.u3 = this.l6(this.l6());
   }

   public int k5() {
      switch (this.u3) {
         case 0:
         case 4:
            return this.k5;
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
         this.n5 = new u6("2.5.29.15", "Key Usage");
      } else {
         this.n5 = new u6(var2.n5);
      }

      this.n5(var2.l6());
      super.s7(var2.u9());
      this.u3 = this.l6(this.l6());
   }

   public int n5(int var1) {
      return (var1 & 33023) != var1 ? 0 : var1;
   }

   public int l6(byte[] var1) {
      if (var1 != null && var1.length != 0) {
         if (com.aspose.slides.internal.v6g.k5.u3(var1[0], 6) != 3) {
            return 2;
         }

         if (var1.length < 3) {
            return 3;
         }

         if (var1.length < 4) {
            return 4;
         }

         try {
            com.aspose.slides.internal.x8w.l6 var2 = new com.aspose.slides.internal.x8w.l6(var1);
            int var3 = 0;
            int var4 = 1;

            while (var4 < var2.u3().length) {
               var3 = (var3 << 8) + com.aspose.slides.internal.v6g.k5.u3(var2.u3()[var4++], 6);
            }

            this.k5 = this.n5(var3);
            return 0;
         } catch (RuntimeException var5) {
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
            if (!"2.5.29.15".equals(this.n5.l6())) {
               return d1.n5("Unknown Key Usage ({0})", new Object[]{this.n5.l6()});
            } else if (this.k5 == 0) {
               return "Information Not Available";
            } else {
               a5 var2 = new a5();
               if ((this.k5 & 128) != 0) {
                  var2.n5("Digital Signature");
               }

               if ((this.k5 & 64) != 0) {
                  if (var2.l6() > 0) {
                     var2.n5(", ");
                  }

                  var2.n5("Non-Repudiation");
               }

               if ((this.k5 & 32) != 0) {
                  if (var2.l6() > 0) {
                     var2.n5(", ");
                  }

                  var2.n5("Key Encipherment");
               }

               if ((this.k5 & 16) != 0) {
                  if (var2.l6() > 0) {
                     var2.n5(", ");
                  }

                  var2.n5("Data Encipherment");
               }

               if ((this.k5 & 8) != 0) {
                  if (var2.l6() > 0) {
                     var2.n5(", ");
                  }

                  var2.n5("Key Agreement");
               }

               if ((this.k5 & 4) != 0) {
                  if (var2.l6() > 0) {
                     var2.n5(", ");
                  }

                  var2.n5("Certificate Signing");
               }

               if ((this.k5 & 2) != 0) {
                  if (var2.l6() > 0) {
                     var2.n5(", ");
                  }

                  var2.n5("Off-line CRL Signing, CRL Signing");
               }

               if ((this.k5 & 1) != 0) {
                  if (var2.l6() > 0) {
                     var2.n5(", ");
                  }

                  var2.n5("Encipher Only");
               }

               if ((this.k5 & 32768) != 0) {
                  if (var2.l6() > 0) {
                     var2.n5(", ");
                  }

                  var2.n5("Decipher Only");
               }

               int var3 = this.k5;
               var2.n5(" (");
               var2.n5(com.aspose.slides.ms.System.e2.n5(com.aspose.slides.internal.v6g.k5.n5((Object)(var3), 9), "x2"));
               if (var3 > 255) {
                  var2.n5(" ");
                  var2.n5(com.aspose.slides.ms.System.e2.n5(com.aspose.slides.internal.v6g.k5.n5((Object)(var3 >> 8), 9), "x2"));
               }

               var2.n5(")");
               if (var1) {
                  var2.n5(p8.k5());
               }

               return var2.toString();
            }
      }
   }
}
