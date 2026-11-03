package com.aspose.slides.internal.o8m;

import com.aspose.slides.exceptions.ArgumentNullException;

public class u3 {
   public u6 n5;
   public byte[] l6;
   private static final com.aspose.slides.internal.v6g.u9 k5 = new com.aspose.slides.internal.v6g.u9(
      "2.5.29.19", "2.5.29.37", "2.5.29.15", "2.5.29.14", "2.5.29.17", "2.16.840.1.113730.1.1"
   );

   protected u3() {
   }

   public u3(String var1, byte[] var2) {
      this.n5 = new u6(var1);
      this.n5(var2);
   }

   public u3(u6 var1, byte[] var2) {
      this.n5(var1);
      this.n5(var2);
   }

   public u6 n5() {
      return this.n5;
   }

   public void n5(u6 var1) {
      if (var1 == null) {
         this.n5 = null;
      } else {
         this.n5 = new u6(var1);
      }
   }

   public byte[] l6() {
      return this.l6;
   }

   public void n5(byte[] var1) {
      if (var1 == null) {
         throw new ArgumentNullException("RawData");
      }

      this.l6 = (byte[])var1.clone();
   }

   public void n5(u3 var1) {
      if (var1 == null) {
         throw new ArgumentNullException("asnEncodedData");
      }

      if (var1.n5 == null) {
         this.n5((u6)null);
      } else {
         this.n5(new u6(var1.n5));
      }

      this.n5(var1.l6);
   }

   public String n5(boolean var1) {
      if (this.l6 == null) {
         return com.aspose.slides.ms.System.d1.n5;
      } else {
         return this.n5 == null ? this.k5(var1) : this.l6(var1);
      }
   }

   public String l6(boolean var1) {
      switch (k5.n5(this.n5.l6())) {
         case 0:
            return this.u3(var1);
         case 1:
            return this.a6(var1);
         case 2:
            return this.u9(var1);
         case 3:
            return this.h0(var1);
         case 4:
            return this.c8(var1);
         case 5:
            return this.t2(var1);
         default:
            return this.k5(var1);
      }
   }

   public String k5(boolean var1) {
      com.aspose.slides.internal.l7h.a5 var2 = new com.aspose.slides.internal.l7h.a5();

      for (int var3 = 0; var3 < this.l6.length; var3++) {
         var2.n5(com.aspose.slides.ms.System.e2.n5(this.l6[var3], "x2"));
         if (var3 != this.l6.length - 1) {
            var2.n5(" ");
         }
      }

      return var2.toString();
   }

   public String u3(boolean var1) {
      try {
         com.aspose.slides.internal.f3c.a6 var2 = new com.aspose.slides.internal.f3c.a6(this, false);
         return var2.l6(var1);
      } catch (RuntimeException var3) {
         return com.aspose.slides.ms.System.d1.n5;
      }
   }

   public String a6(boolean var1) {
      try {
         com.aspose.slides.internal.f3c.z3 var2 = new com.aspose.slides.internal.f3c.z3(this, false);
         return var2.l6(var1);
      } catch (RuntimeException var3) {
         return com.aspose.slides.ms.System.d1.n5;
      }
   }

   public String u9(boolean var1) {
      try {
         com.aspose.slides.internal.f3c.z8 var2 = new com.aspose.slides.internal.f3c.z8(this, false);
         return var2.l6(var1);
      } catch (RuntimeException var3) {
         return com.aspose.slides.ms.System.d1.n5;
      }
   }

   public String h0(boolean var1) {
      try {
         com.aspose.slides.internal.f3c.w1 var2 = new com.aspose.slides.internal.f3c.w1(this, false);
         return var2.l6(var1);
      } catch (RuntimeException var3) {
         return com.aspose.slides.ms.System.d1.n5;
      }
   }

   public String c8(boolean var1) {
      if (this.l6.length < 5) {
         return "Information Not Available";
      }

      try {
         com.aspose.slides.internal.x8w.l6 var2 = new com.aspose.slides.internal.x8w.l6(this.l6);
         com.aspose.slides.internal.l7h.a5 var3 = new com.aspose.slides.internal.l7h.a5();

         for (int var4 = 0; var4 < var2.n5(); var4++) {
            com.aspose.slides.internal.x8w.l6 var5 = var2.n5(var4);
            String var6 = null;
            String var7 = null;
            switch (var5.l6()) {
               case -127:
                  var6 = "RFC822 Name=";
                  var7 = com.aspose.slides.internal.l7h.j5.e2().l6(var5.u3());
                  break;
               case -126:
                  var6 = "DNS Name=";
                  var7 = com.aspose.slides.internal.l7h.j5.e2().l6(var5.u3());
                  break;
               default:
                  var6 = com.aspose.slides.ms.System.d1.n5("Unknown ({0})=", new Object[]{com.aspose.slides.internal.v6g.k5.n5(var5.l6())});
                  var7 = com.aspose.slides.internal.x8w.n3.n5(var5.u3());
            }

            var3.n5(var6);
            var3.n5(var7);
            if (var1) {
               var3.n5(com.aspose.slides.ms.System.p8.k5());
            } else if (var4 < var2.n5() - 1) {
               var3.n5(", ");
            }
         }

         return var3.toString();
      } catch (RuntimeException var8) {
         return com.aspose.slides.ms.System.d1.n5;
      }
   }

   public String t2(boolean var1) {
      if (this.l6.length >= 4 && com.aspose.slides.internal.v6g.k5.u3(this.l6[0], 6) == 3 && com.aspose.slides.internal.v6g.k5.u3(this.l6[1], 6) == 2) {
         int var2 = com.aspose.slides.internal.v6g.k5.u3(this.l6[3], 6)
            >> com.aspose.slides.internal.v6g.k5.u3(this.l6[2], 6)
            << com.aspose.slides.internal.v6g.k5.u3(this.l6[2], 6);
         com.aspose.slides.internal.l7h.a5 var3 = new com.aspose.slides.internal.l7h.a5();
         if ((var2 & 128) == 128) {
            var3.n5("SSL Client Authentication");
         }

         if ((var2 & 64) == 64) {
            if (var3.l6() > 0) {
               var3.n5(", ");
            }

            var3.n5("SSL Server Authentication");
         }

         if ((var2 & 32) == 32) {
            if (var3.l6() > 0) {
               var3.n5(", ");
            }

            var3.n5("SMIME");
         }

         if ((var2 & 16) == 16) {
            if (var3.l6() > 0) {
               var3.n5(", ");
            }

            var3.n5("Signature");
         }

         if ((var2 & 8) == 8) {
            if (var3.l6() > 0) {
               var3.n5(", ");
            }

            var3.n5("Unknown cert type");
         }

         if ((var2 & 4) == 4) {
            if (var3.l6() > 0) {
               var3.n5(", ");
            }

            var3.n5("SSL CA");
         }

         if ((var2 & 2) == 2) {
            if (var3.l6() > 0) {
               var3.n5(", ");
            }

            var3.n5("SMIME CA");
         }

         if ((var2 & 1) == 1) {
            if (var3.l6() > 0) {
               var3.n5(", ");
            }

            var3.n5("Signature CA");
         }

         var3.n5(" ({0})",new Object[]{ com.aspose.slides.ms.System.a3.n5(var2, "x2")});
         return var3.toString();
      } else {
         return "Information Not Available";
      }
   }
}
