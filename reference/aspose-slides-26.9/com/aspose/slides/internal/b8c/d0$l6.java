package com.aspose.slides.internal.b8c;

import com.aspose.slides.Collections.DictionaryEntry;
import com.aspose.slides.Collections.IEnumerator;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.exceptions.InvalidOperationException;

public class d0$l6 implements IEnumerator {
   private List<d0$k5> a6;
   private int u9;
   protected int n5;
   protected int l6;
   protected com.aspose.slides.ms.System.Xml.k6 k5;
   protected x4 u3;

   public d0$l6(List<d0$k5> var1, int var2, int var3) {
      this.a6 = var1;
      this.l6 = var2;
      this.u9 = var3;
      this.n5 = -1;
   }

   @Override
   public final Object next() {
      if (this.n5 == -1) {
         throw new InvalidOperationException(
            com.aspose.slides.ms.System.Xml.v3.n5("Enumeration has not started. Call MoveNext.", com.aspose.slides.ms.System.d1.n5)
         );
      }

      if (this.n5 >= this.l6) {
         throw new InvalidOperationException(com.aspose.slides.ms.System.Xml.v3.n5("Enumeration has already finished.", com.aspose.slides.ms.System.d1.n5));
      }

      switch (this.u9) {
         case 0:
            return this.k5;
         case 1:
            return this.u3;
         case 2:
            return new DictionaryEntry(this.k5, this.u3);
         default:
            return null;
      }
   }

   @Override
   public final boolean hasNext() {
      if (this.n5 >= this.l6 - 1) {
         this.u3 = null;
         this.k5 = null;
         return false;
      } else {
         this.n5++;
         this.u3 = this.a6.get_Item(this.n5).l6;
         this.k5 = this.a6.get_Item(this.n5).n5;
         return true;
      }
   }

   @Override
   public final void reset() {
      this.n5 = -1;
      this.u3 = null;
      this.k5 = null;
   }

   @Override
   public void remove() {
      throw new UnsupportedOperationException();
   }
}
