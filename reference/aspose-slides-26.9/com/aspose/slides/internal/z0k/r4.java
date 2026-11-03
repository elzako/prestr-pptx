package com.aspose.slides.internal.z0k;

import com.aspose.slides.exceptions.ArgumentException;
import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.exceptions.ArgumentOutOfRangeException;
import com.aspose.slides.exceptions.ObjectDisposedException;
import com.aspose.slides.internal.l7h.a5;
import com.aspose.slides.ms.System.h2;
import com.aspose.slides.ms.System.j3;

@j3
public class r4 extends a0 {
   private a5 n5;
   private boolean a6;

   public r4() {
      this(new a5());
   }

   public r4(h2 var1) {
      this(new a5(), var1);
   }

   public r4(a5 var1) {
      this(var1, null);
   }

   public r4(a5 var1, h2 var2) {
      if (var1 == null) {
         throw new ArgumentNullException("sb");
      }

      this.n5 = var1;
      this.k5 = var2;
   }

   @Override
   public com.aspose.slides.internal.l7h.j5 l6() {
      return com.aspose.slides.internal.l7h.j5.z1();
   }

   @Override
   public void u3() {
      this.l6(true);
      this.a6 = true;
   }

   @Override
   protected void l6(boolean var1) {
      super.l6(var1);
      this.a6 = true;
   }

   @Override
   public String toString() {
      return this.n5.toString();
   }

   @Override
   public void n5(char var1) {
      if (this.a6) {
         throw new ObjectDisposedException("StringReader", "Cannot write to a closed StringWriter");
      }

      this.n5.n5(var1);
   }

   @Override
   public void n5(String var1) {
      if (this.a6) {
         throw new ObjectDisposedException("StringReader", "Cannot write to a closed StringWriter");
      }

      this.n5.n5(var1);
   }

   @Override
   public void n5(char[] var1, int var2, int var3) {
      if (this.a6) {
         throw new ObjectDisposedException("StringReader", "Cannot write to a closed StringWriter");
      }

      if (var1 == null) {
         throw new ArgumentNullException("buffer");
      }

      if (var2 < 0) {
         throw new ArgumentOutOfRangeException("index", "< 0");
      }

      if (var3 < 0) {
         throw new ArgumentOutOfRangeException("count", "< 0");
      }

      if (var2 > var1.length - var3) {
         throw new ArgumentException("index + count > buffer.Length");
      }

      this.n5.n5(var1, var2, var3);
   }
}
