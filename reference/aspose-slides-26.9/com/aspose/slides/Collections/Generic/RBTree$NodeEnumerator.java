package com.aspose.slides.Collections.Generic;

import com.aspose.slides.Collections.IEnumerator;
import com.aspose.slides.exceptions.InvalidOperationException;
import com.aspose.slides.exceptions.NotImplementedException;
import com.aspose.slides.exceptions.ObjectDisposedException;
import com.aspose.slides.internal.v6g.h0;
import com.aspose.slides.ms.System.j3;
import com.aspose.slides.ms.System.j8;

@j3
public class RBTree$NodeEnumerator extends h0<RBTree$NodeEnumerator> implements IGenericEnumerator<RBTree$Node> {
   private RBTree l6;
   private long k5;
   private Stack<RBTree$Node> u3;
   private Stack<RBTree$Node> a6;
   // $VF: synthetic field
   static final boolean n5 = !RBTree.class.desiredAssertionStatus();

   public RBTree$NodeEnumerator() {
   }

   RBTree$NodeEnumerator(RBTree tree) {
      this();
      this.l6 = tree;
      this.k5 = RBTree.n5(tree);
   }

   @Override
   public void reset() {
      this.k5();
      this.u3 = null;
   }

   public RBTree$Node next() {
      return this.u3.peek();
   }

   public IEnumerator getIEnumerator() {
      return new RBTree$NodeEnumerator$1(this);
   }

   boolean n5() {
      this.k5();
      RBTree$Node var1;
      if (this.u3 == null) {
         if (RBTree.l6(this.l6) == null) {
            return false;
         }

         if (this.a6 != null) {
            this.u3 = this.a6;
            this.a6 = null;
            return this.u3.size() != 0;
         }

         this.u3 = new Stack<>();
         var1 = RBTree.l6(this.l6);
      } else {
         if (this.u3.size() == 0) {
            return false;
         }

         RBTree$Node var2 = this.u3.pop();
         var1 = var2.right;
      }

      while (var1 != null) {
         this.u3.push(var1);
         var1 = var1.left;
      }

      return this.u3.size() != 0;
   }

   @Override
   public boolean hasNext() {
      return this.n5();
   }

   @Override
   public void remove() {
      throw new NotImplementedException();
   }

   @Override
   public void dispose() {
      this.l6 = null;
      this.u3 = null;
   }

   private void k5() {
      if (this.l6 == null) {
         throw new ObjectDisposedException("enumerator");
      }

      if (this.k5 != RBTree.n5(this.l6)) {
         throw new InvalidOperationException("tree modified");
      }
   }

   void l6() {
      this.k5();
      if (this.u3 == null) {
         throw new InvalidOperationException("state invalid before the first MoveNext()");
      }
   }

   public void CloneTo(RBTree$NodeEnumerator that) {
      that.l6 = this.l6;
      that.k5 = this.k5;
      that.u3 = this.u3;
      that.a6 = this.a6;
   }

   public RBTree$NodeEnumerator Clone() {
      RBTree$NodeEnumerator var1 = new RBTree$NodeEnumerator();
      this.CloneTo(var1);
      return var1;
   }

   @Override
   public Object clone() {
      return this.Clone();
   }

   private boolean k5(RBTree$NodeEnumerator var1) {
      return j8.n5(var1.l6, this.l6) && var1.k5 == this.k5 && j8.n5(var1.u3, this.u3) && j8.n5(var1.a6, this.a6);
   }

   @Override
   public boolean equals(Object obj) {
      assert obj != null;
      if (j8.l6(null, obj)) {
         return false;
      } else if (j8.l6(this, obj)) {
         return true;
      } else {
         return !(obj instanceof RBTree$NodeEnumerator) ? false : this.k5((RBTree$NodeEnumerator)obj);
      }
   }

   public static boolean equals(RBTree$NodeEnumerator obj1, RBTree$NodeEnumerator obj2) {
      return obj1.equals(obj2);
   }

   @Override
   public int hashCode() {
      int var1 = this.l6 != null ? this.l6.hashCode() : 0;
      var1 = 31 * var1 + (int)(this.k5 ^ this.k5 >>> 32);
      var1 = 31 * var1 + (this.u3 != null ? this.u3.hashCode() : 0);
      return 31 * var1 + (this.a6 != null ? this.a6.hashCode() : 0);
   }

   // $VF: synthetic method
   static Stack n5(RBTree$NodeEnumerator var0) {
      return var0.u3;
   }

   // $VF: synthetic method
   static void l6(RBTree$NodeEnumerator var0) {
      var0.k5();
   }

   // $VF: synthetic method
   static Stack n5(RBTree$NodeEnumerator var0, Stack var1) {
      return var0.u3 = var1;
   }
}
