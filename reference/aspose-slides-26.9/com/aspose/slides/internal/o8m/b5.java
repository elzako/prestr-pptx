package com.aspose.slides.internal.o8m;

import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.exceptions.NullReferenceException;

public class b5 {
   private String n5;
   private String l6;
   private String k5;
   private String u3;

   public String n5() {
      return this.n5;
   }

   public void n5(String var1) {
      this.n5 = var1;
   }

   public String l6() {
      return this.l6;
   }

   public void l6(String var1) {
      this.l6 = var1;
   }

   public String k5() {
      return this.k5;
   }

   public void k5(String var1) {
      this.k5 = var1;
   }

   public String u3() {
      return this.u3;
   }

   public void u3(String var1) {
      this.u3 = var1;
   }

   public c8 n5(a6 var1) {
      if (this.n5 == null) {
         throw new ArgumentNullException("DeformatterAlgorithm");
      }

      c8 var2 = (c8)y4.n5(this.n5);
      if (this.u3 == null) {
         throw new NullReferenceException("KeyAlgorithm");
      }

      var2.n5(var1);
      return var2;
   }

   public f2 a6() {
      if (this.l6 == null) {
         throw new ArgumentNullException("DigestAlgorithm");
      } else {
         return (f2)y4.n5(this.l6);
      }
   }

   public t2 l6(a6 var1) {
      if (this.k5 == null) {
         throw new ArgumentNullException("FormatterAlgorithm");
      }

      t2 var2 = (t2)y4.n5(this.k5);
      if (this.u3 == null) {
         throw new NullReferenceException("KeyAlgorithm");
      }

      var2.n5(var1);
      return var2;
   }

   @Override
   public String toString() {
      String var1 = com.aspose.slides.ms.System.j8.n5(this).s7().substring(com.aspose.slides.ms.System.j8.n5(this).s7().lastIndexOf(46) + 1);
      return "System.Security.Cryptography." + var1;
   }
}
