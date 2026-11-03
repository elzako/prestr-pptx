package com.aspose.slides.internal.f3c;

import com.aspose.slides.exceptions.ArgumentException;
import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.exceptions.CryptographicException;
import com.aspose.slides.exceptions.NullReferenceException;
import com.aspose.slides.internal.l7h.a5;
import com.aspose.slides.internal.o8m.u6;
import com.aspose.slides.ms.System.d1;
import com.aspose.slides.ms.System.p8;

public final class a6 extends m1 {
   private boolean k5;
   private boolean u3;
   private int a6;
   private int u9;

   public a6() {
      this.n5 = new u6("2.5.29.19", "Basic Constraints");
   }

   public a6(com.aspose.slides.internal.o8m.u3 var1, boolean var2) {
      if (var1 == null) {
         throw new NullReferenceException();
      }

      this.n5 = new u6("2.5.29.19", "Basic Constraints");
      this.l6 = var1.l6();
      super.s7(var2);
      this.u9 = this.l6(this.l6());
   }

   public boolean k5() {
      switch (this.u9) {
         case 0:
         case 4:
            return this.k5;
         default:
            throw new CryptographicException("Badly encoded extension.");
      }
   }

   public boolean u3() {
      switch (this.u9) {
         case 0:
         case 4:
            return this.u3;
         default:
            throw new CryptographicException("Badly encoded extension.");
      }
   }

   public int a6() {
      switch (this.u9) {
         case 0:
         case 4:
            return this.a6;
         default:
            throw new CryptographicException("Badly encoded extension.");
      }
   }

   @Override
   public void n5(com.aspose.slides.internal.o8m.u3 var1) {
      if (var1 == null) {
         throw new ArgumentNullException("asnEncodedData");
      }

      m1 var2 = com.aspose.slides.internal.v6g.k5.n5(var1, m1.class);
      if (var2 == null) {
         throw new ArgumentException(d1.n5("Wrong type.", new Object[]{}), "asnEncodedData");
      }

      if (var2.n5 == null) {
         this.n5 = new u6("2.5.29.19", "Basic Constraints");
      } else {
         this.n5 = new u6(var2.n5);
      }

      this.n5(var2.l6());
      super.s7(var2.u9());
      this.u9 = this.l6(this.l6());
   }

   public int l6(byte[] var1) {
      if (var1 != null && var1.length != 0) {
         if (com.aspose.slides.internal.v6g.k5.u3(var1[0], 6) != 48) {
            return 2;
         }

         if (var1.length >= 3 || var1.length == 2 && com.aspose.slides.internal.v6g.k5.u3(var1[1], 6) == 0) {
            try {
               com.aspose.slides.internal.x8w.l6 var2 = new com.aspose.slides.internal.x8w.l6(var1);
               int var3 = 0;
               com.aspose.slides.internal.x8w.l6 var4 = var2.n5(var3++);
               if (var4 != null && com.aspose.slides.internal.v6g.k5.u3(var4.l6(), 6) == 1) {
                  this.k5 = com.aspose.slides.internal.v6g.k5.u3(var4.u3()[0], 6) == 255;
                  var4 = var2.n5(var3++);
               }

               if (var4 != null && com.aspose.slides.internal.v6g.k5.u3(var4.l6(), 6) == 2) {
                  this.u3 = true;
                  this.a6 = com.aspose.slides.internal.x8w.k5.n5(var4);
               }

               return 0;
            } catch (RuntimeException var5) {
               return 1;
            }
         } else {
            return 3;
         }
      } else {
         return 1;
      }
   }

   @Override
   public String l6(boolean var1) {
      switch (this.u9) {
         case 1:
            return d1.n5;
         case 2:
         case 3:
            return this.k5(this.l6);
         case 4:
            return "Information Not Available";
         default:
            if (!"2.5.29.19".equals(this.n5.l6())) {
               return d1.n5("Unknown Key Usage ({0})", new Object[]{this.n5.l6()});
            } else {
               a5 var2 = new a5();
               var2.n5("Subject Type=");
               if (this.k5) {
                  var2.n5("CA");
               } else {
                  var2.n5("End Entity");
               }

               if (var1) {
                  var2.n5(p8.k5());
               } else {
                  var2.n5(", ");
               }

               var2.n5("Path Length Constraint=");
               if (this.u3) {
                  var2.k5(this.a6);
               } else {
                  var2.n5("None");
               }

               if (var1) {
                  var2.n5(p8.k5());
               }

               return var2.toString();
            }
      }
   }
}
