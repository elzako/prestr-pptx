package com.aspose.slides.Collections;

import com.aspose.slides.exceptions.InvalidOperationException;
import com.aspose.slides.exceptions.NotSupportedException;
import com.aspose.slides.ms.System.d1;
import com.aspose.slides.ms.System.d5;
import com.aspose.slides.ms.System.v4;

@Deprecated
final class SortedList$EnumeratorJava implements IDictionaryEnumerator, v4 {
   private SortedList n5;
   private Object l6;
   private Object k5;
   private int u3;
   private int a6;
   private int u9;
   private int h0;
   private boolean c8 = false;
   private static String t2 = "SortedList.EnumeratorJava: snapshot out of sync.";

   public SortedList$EnumeratorJava(SortedList host, int mode) {
      this.n5 = host;
      this.u3 = SortedList.n5(host);
      this.u9 = host.size();
      this.h0 = mode;
      this.reset();
   }

   @Override
   public void reset() {
      if (SortedList.n5(this.n5) == this.u3 && !this.c8) {
         this.a6 = -1;
         this.l6 = null;
         this.k5 = null;
      } else {
         throw new IllegalStateException(t2);
      }
   }

   @Override
   public boolean hasNext() {
      if (SortedList.n5(this.n5) == this.u3 && !this.c8) {
         return ++this.a6 < this.u9;
      } else {
         throw new InvalidOperationException(t2);
      }
   }

   @Override
   public DictionaryEntry getEntry() {
      if (!this.c8 && this.a6 < this.u9 && this.a6 != -1) {
         return new DictionaryEntry(this.l6, this.k5);
      } else {
         throw new IllegalStateException(t2);
      }
   }

   @Override
   public Object getKey() {
      if (!this.c8 && this.a6 < this.u9 && this.a6 != -1) {
         return this.l6;
      } else {
         throw new IllegalStateException(t2);
      }
   }

   @Override
   public Object getValue() {
      if (!this.c8 && this.a6 < this.u9 && this.a6 != -1) {
         return this.k5;
      } else {
         throw new IllegalStateException(t2);
      }
   }

   @Override
   public Object next() {
      if (SortedList.n5(this.n5) != this.u3 || this.c8) {
         throw new InvalidOperationException(t2);
      }

      if (!this.c8 && this.a6 < this.u9 && this.a6 != -1) {
         SortedList$Slot[] var1 = SortedList.l6(this.n5);
         SortedList$Slot var2 = var1[this.a6].Clone();
         this.l6 = var2.n5;
         this.k5 = var2.l6;
         switch (this.h0) {
            case 0:
               return this.l6;
            case 1:
               return this.k5;
            case 2:
               return this.getEntry();
            default:
               throw new NotSupportedException(d1.n5(new String[]{d5.getName(SortedList$EnumeratorMode.class, this.h0), " is not a supported mode."}));
         }
      } else {
         if (this.a6 >= this.u9) {
            this.l6 = null;
            this.k5 = null;
         }

         throw new IllegalStateException(t2);
      }
   }

   @Override
   public Object deepClone() {
      SortedList$EnumeratorJava var1 = new SortedList$EnumeratorJava(this.n5, this.h0);
      var1.u3 = this.u3;
      var1.a6 = this.a6;
      var1.u9 = this.u9;
      var1.l6 = this.l6;
      var1.k5 = this.k5;
      var1.c8 = this.c8;
      return var1;
   }

   @Override
   public void remove() {
      throw new NotSupportedException();
   }
}
