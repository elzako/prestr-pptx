package com.aspose.slides.Collections.Generic;

import com.aspose.slides.exceptions.InvalidOperationException;
import com.aspose.slides.exceptions.NotSupportedException;
import com.aspose.slides.exceptions.ObjectDisposedException;
import com.aspose.slides.internal.h3d.c4;
import com.aspose.slides.internal.h3d.s3;
import com.aspose.slides.internal.h3d.s7;
import com.aspose.slides.internal.v6g.h0;
import com.aspose.slides.internal.v6g.k5;
import com.aspose.slides.ms.System.IDisposable;
import com.aspose.slides.ms.System.j8;

public class LinkedList$Enumerator<T> extends h0<LinkedList$Enumerator> implements IGenericEnumerator<T>, com.aspose.slides.internal.h3d.h0, s7, IDisposable {
   private LinkedList<T> l6;
   private LinkedListNode<T> k5;
   private int u3;
   private long a6;
   private c4 u9;
   // $VF: synthetic field
   static final boolean n5 = !LinkedList.class.desiredAssertionStatus();

   public LinkedList$Enumerator() {
   }

   LinkedList$Enumerator(LinkedList<T> parent) {
      this.u9 = null;
      this.l6 = parent;
      this.k5 = null;
      this.u3 = -1;
      this.a6 = LinkedList.n5(parent);
   }

   @Override
   public T next() {
      if (this.l6 == null) {
         throw new ObjectDisposedException(null);
      } else {
         return this.k5 == null ? null : this.k5.getValue();
      }
   }

   @Override
   public boolean hasNext() {
      if (this.l6 == null) {
         throw new ObjectDisposedException(null);
      }

      if (com.aspose.slides.internal.v6g.k5.a6(this.a6, 10) != com.aspose.slides.internal.v6g.k5.a6(LinkedList.n5(this.l6), 10)) {
         throw new InvalidOperationException("list modified");
      }

      if (this.k5 == null) {
         this.k5 = this.l6.n5;
      } else {
         this.k5 = this.k5.n5;
         if (this.k5 == this.l6.n5) {
            this.k5 = null;
         }
      }

      if (this.k5 == null) {
         this.u3 = -1;
         return false;
      } else {
         this.u3++;
         return true;
      }
   }

   @Override
   public void reset() {
      if (this.l6 == null) {
         throw new ObjectDisposedException(null);
      }

      if (com.aspose.slides.internal.v6g.k5.a6(this.a6, 10) != com.aspose.slides.internal.v6g.k5.a6(LinkedList.n5(this.l6), 10)) {
         throw new InvalidOperationException("list modified");
      }

      this.k5 = null;
      this.u3 = -1;
   }

   @Override
   public void dispose() {
      if (this.l6 == null) {
         throw new ObjectDisposedException(null);
      }

      this.k5 = null;
      this.l6 = null;
   }

   @Override
   public void getObjectData(c4 info, s3 context) {
      throw new NotSupportedException();
   }

   @Override
   public void onDeserialization(Object sender) {
      throw new NotSupportedException();
   }

   @Override
   public void remove() {
      throw new UnsupportedOperationException();
   }

   public void CloneTo(LinkedList$Enumerator that) {
      that.l6 = this.l6;
      that.k5 = this.k5;
      that.u3 = this.u3;
      that.a6 = this.a6;
      that.u9 = this.u9;
   }

   public LinkedList$Enumerator Clone() {
      LinkedList$Enumerator var1 = new LinkedList$Enumerator();
      this.CloneTo(var1);
      return var1;
   }

   @Override
   public Object clone() {
      return this.Clone();
   }

   private boolean n5(LinkedList$Enumerator var1) {
      return j8.n5(var1.l6, this.l6) && j8.n5(var1.k5, this.k5) && var1.u3 == this.u3 && var1.a6 == this.a6 && j8.n5(var1.u9, this.u9);
   }

   @Override
   public boolean equals(Object obj) {
      assert obj != null;
      if (j8.l6(null, obj)) {
         return false;
      } else if (j8.l6(this, obj)) {
         return true;
      } else {
         return !(obj instanceof LinkedList$Enumerator) ? false : this.n5((LinkedList$Enumerator)obj);
      }
   }

   public static boolean equals(LinkedList$Enumerator obj1, LinkedList$Enumerator obj2) {
      return obj1.equals(obj2);
   }

   @Override
   public int hashCode() {
      int var1 = this.l6 != null ? this.l6.hashCode() : 0;
      var1 = 31 * var1 + (this.k5 != null ? this.k5.hashCode() : 0);
      var1 = 31 * var1 + this.u3;
      var1 = 31 * var1 + (int)(this.a6 ^ this.a6 >>> 32);
      return 31 * var1 + (this.u9 != null ? this.u9.hashCode() : 0);
   }
}
