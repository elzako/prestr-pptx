package com.aspose.slides;

import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.exceptions.ArgumentOutOfRangeException;
import com.aspose.slides.ms.System.IDisposable;

public final class SmartArtNodeCollection implements ISmartArtNodeCollection {
   private final List<ISmartArtNode> n5 = new List<>();
   private final SmartArtNode l6;

   @Override
   public final ISmartArtNode get_Item(int index) {
      return this.n5.get_Item(index);
   }

   @Override
   public final int size() {
      return this.n5.size();
   }

   @Override
   public final ISmartArtNode addNode() {
      t5w var1 = new t5w(this.l6.a6().getPresentation(), InterruptionToken.getNone());
      SmartArtNode var2 = this.n5(var1);
      this.l6.a6().l6(var1);
      return var2;
   }

   @Override
   public final void removeNode(int index) {
      if (index >= 0 && index <= this.n5.size() - 1) {
         ISmartArtNode var2 = this.n5.get_Item(index);
         this.removeNode(var2);
      } else {
         throw new ArgumentOutOfRangeException("Index out of range.");
      }
   }

   @Override
   public final void removeNode(ISmartArtNode node) {
      SmartArtNode var2 = (SmartArtNode)node;
      SmartArtNodeCollection var3 = (SmartArtNodeCollection)var2.getChildNodes();
      SmartArtNodeCollection var4 = (SmartArtNodeCollection)var2.u3().getChildNodes();
      int var5 = var4.n5.indexOf(var2);
      var4.n5.removeItem(var2);
      if (var3.size() > 0) {
         SmartArtNode var6 = (SmartArtNode)var2.getChildNodes().get_Item(0);
         var6.n5(var2.u3());
         var4.n5.insertItem(var5, var6);
         int var7 = var3.n5.indexOf(var6);
         var3.n5.removeAt(var7);
         SmartArtNodeCollection var8 = (SmartArtNodeCollection)var6.getChildNodes();
         IGenericEnumerator var9 = var2.getChildNodes().iterator();

         try {
            while (var9.hasNext()) {
               SmartArtNode var10 = (SmartArtNode)var9.next();
               if (var10 != var6) {
                  var10.n5(var6);
                  var8.n5.addItem(var10);
               }
            }
         } finally {
            if (com.aspose.slides.internal.v6g.k5.n5(var9, IDisposable.class)) {
               var9.dispose();
            }
         }
      }

      this.l6.a6().x8();
   }

   @Override
   public final ISmartArtNode addNodeByPosition(int position) {
      if (position < 0) {
         throw new ArgumentOutOfRangeException("Position can not be less than 0");
      }

      t5w var2 = new t5w(this.l6.a6().getPresentation(), InterruptionToken.getNone());
      SmartArtNode var3 = this.n5(var2);
      int var4 = this.n5.indexOf(var3);
      if (var4 != position && position < this.n5.size()) {
         this.n5.removeAt(var4);
         this.n5.insertItem(position, var3);
      }

      this.l6.a6().l6(var2);
      return var3;
   }

   @Override
   public final IGenericEnumerator<ISmartArtNode> iterator() {
      return this.n5.iterator();
   }

   @Override
   public final IGenericEnumerator<ISmartArtNode> iteratorJava() {
      return this.n5.iteratorJava();
   }

   @Override
   public final void copyTo(com.aspose.slides.ms.System.u3 array, int index) {
      this.n5.copyTo(array, index);
   }

   @Override
   public final boolean isSynchronized() {
      return false;
   }

   @Override
   public final Object getSyncRoot() {
      return this;
   }

   SmartArtNodeCollection(SmartArtNode parent) {
      this.l6 = parent;
   }

   final SmartArtNode n5(w4c var1, w4c var2, w4c var3) {
      SmartArtNode var4 = new SmartArtNode(this.l6, this.l6.a6());
      var4.n5(var1);
      var4.l6(var2);
      var4.k5(var3);
      ((SmartArtNodeCollection)this.l6.getChildNodes()).n5.addItem(var4);
      return var4;
   }

   final void n5() {
      this.n5.clear();
      this.l6(this.l6);
   }

   private void l6(ISmartArtNode var1) {
      IGenericEnumerator var2 = var1.getChildNodes().iterator();

      try {
         while (var2.hasNext()) {
            ISmartArtNode var3 = (ISmartArtNode)var2.next();
            this.n5.addItem(var3);
            this.l6(var3);
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var2, IDisposable.class)) {
            var2.dispose();
         }
      }
   }

   final int n5(ISmartArtNode var1) {
      return this.n5.indexOf(var1);
   }

   final void n5(ISmartArtNode var1, int var2) {
      int var3 = this.n5.indexOf(var1);
      if (var3 != -1 && var3 != var2) {
         this.n5.removeAt(var3);
         this.n5.insertItem(var2, var1);
      }

      this.l6.a6().x8();
   }

   private com.aspose.slides.internal.k4y.h6q n5(int var1) {
      com.aspose.slides.internal.k4y.h6q var2 = new com.aspose.slides.internal.k4y.h6q();
      var2.n5(com.aspose.slides.ms.System.d1.n5(new String[]{"{", com.aspose.slides.ms.System.d1.t2(com.aspose.slides.ms.System.o0.l6().toString()), "}"}));
      var2.n5(var1);
      if (var1 == 1 || var1 == 2) {
         var2.n5();
      }

      var2.l6();
      return var2;
   }

   private SmartArtNode n5(t5w var1) {
      w4c var2 = new w4c(this.n5(1), this.l6.a6(), var1);
      w4c var3 = new w4c(this.n5(5), this.l6.a6(), var1);
      w4c var4 = new w4c(this.n5(6), this.l6.a6(), var1);
      return this.n5(var2, var3, var4);
   }
}
