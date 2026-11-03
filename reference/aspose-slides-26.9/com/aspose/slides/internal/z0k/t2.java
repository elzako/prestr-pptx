package com.aspose.slides.internal.z0k;

import com.aspose.slides.exceptions.ArgumentException;
import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.exceptions.FileNotFoundException;
import com.aspose.slides.ms.System.d1;
import com.aspose.slides.ms.System.j3;
import java.io.File;

@j3
public final class t2 extends y4 {
   public t2(String var1) {
      if (var1 == null) {
         throw new ArgumentNullException("fileName");
      }

      this.k5(var1);
      this.l6 = var1;
      this.n5 = z1.k5(var1);
   }

   public boolean n5() {
      return new File(this.n5).exists();
   }

   @Override
   public String l6() {
      return z1.n5(this.n5);
   }

   public long k5() {
      if (!this.n5()) {
         throw new FileNotFoundException(d1.n5(new String[]{"Could not find file \"", this.l6, "\"."}), this.l6);
      }

      File var1 = new File(this.n5);
      return var1.length();
   }

   public void u3() {
      u9.l6(this.n5);
   }

   public t2 n5(String var1) {
      return this.n5(var1, false);
   }

   public t2 n5(String var1, boolean var2) {
      if (var1 == null) {
         throw new ArgumentNullException("destFileName");
      }

      if (var1.length() == 0) {
         throw new ArgumentException("An empty file name is not valid.", "destFileName");
      }

      if (d1.l6(var1).length() == 0) {
         throw new ArgumentException("An empty file name is not valid.");
      }

      String var3 = z1.k5(var1);
      if (var2 && u9.k5(var3)) {
         u9.l6(var3);
      }

      u9.l6(this.n5, var3);
      return new t2(var3);
   }

   @Override
   public String toString() {
      return this.l6;
   }
}
