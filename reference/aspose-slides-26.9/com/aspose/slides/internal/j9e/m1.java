package com.aspose.slides.internal.j9e;

import com.aspose.slides.Collections.ArrayList;
import com.aspose.slides.exceptions.ArgumentException;
import java.awt.Image;
import java.util.Iterator;

public class m1 implements Iterable<z3> {
   private final ArrayList n5 = new ArrayList();
   private int l6 = 0;

   public int n5() {
      return this.n5.size();
   }

   @Override
   public Iterator<z3> iterator() {
      return this.n5.iterator();
   }

   public void n5(z3 var1) {
      this.n5.addItem(var1);
   }

   public void l6() {
      for (int var1 = 0; var1 < this.n5.size(); var1++) {
         if (((z3)this.n5.get(var1)).l6() != null) {
            ((z3)this.n5.get(var1)).l6().reset();
         }

         ((z3)this.n5.get(var1)).n5((Image)null);
      }

      this.n5.clear();
   }

   public z3 n5(int var1) {
      return (z3)this.n5.get_Item(var1);
   }

   public z3 k5() {
      return (z3)this.n5.get_Item(this.a6());
   }

   public int u3() {
      return this.a6();
   }

   public void l6(int var1) {
      this.l6 = this.k5(var1);
   }

   private int a6() {
      return this.k5(this.l6);
   }

   private int k5(int var1) {
      if (var1 >= this.n5()) {
         throw new ArgumentException("Position is out of range!");
      } else {
         return var1;
      }
   }
}
