package com.aspose.slides.internal.x7n;

import com.aspose.slides.Collections.IEnumerator;
import com.aspose.slides.exceptions.InvalidOperationException;
import com.aspose.slides.exceptions.NotSupportedException;
import com.aspose.slides.ms.System.d1;
import com.aspose.slides.ms.System.j3;

@j3
public class y4 implements IEnumerator {
   private int n5 = -1;
   private int l6;
   private int k5;
   private String u3;
   private String a6;

   y4(String var1, int var2) {
      this.k5 = var2;
      this.u3 = d1.k5(var1, var2);
      this.a6 = null;
   }

   @Override
   public Object next() {
      if (this.a6 == null) {
         throw new InvalidOperationException();
      } else {
         return this.a6;
      }
   }

   public String n5() {
      if (this.a6 == null) {
         throw new InvalidOperationException();
      } else {
         return this.a6;
      }
   }

   @Override
   public boolean hasNext() {
      this.l6 = this.n5 + 1;
      if (this.l6 < this.u3.length()) {
         this.a6 = x8.n5(this.u3, this.l6);
         this.n5 = this.n5 + this.a6.length();
         return true;
      } else {
         this.a6 = null;
         return false;
      }
   }

   @Override
   public void reset() {
      this.a6 = null;
      this.n5 = -1;
   }

   @Override
   public void remove() {
      throw new NotSupportedException();
   }
}
