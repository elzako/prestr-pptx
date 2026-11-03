package com.aspose.slides.internal.r7c;

import com.aspose.slides.Collections.ICollection;
import com.aspose.slides.Collections.IEnumerable;
import com.aspose.slides.Collections.IEnumerator;
import com.aspose.slides.Collections.Generic.List;
import java.util.regex.Matcher;

public class k5 implements ICollection, IEnumerable {
   private List<String> n5;
   private u3 l6;
   private Matcher k5;
   private List<l6> u3;

   k5(u3 var1, List<String> var2) {
      this.l6 = var1;
      this.n5 = var2;
      this.k5 = com.aspose.slides.internal.r7c.u3.n5(this.l6);
   }

   public l6 n5(int var1) {
      return var1 < this.n5() && var1 >= 0 ? this.k5().get(var1) : com.aspose.slides.internal.r7c.l6.k5;
   }

   private void l6() {
      int var1 = this.n5();
      this.u3 = new List<>(var1);

      for (int var2 = 0; var2 < var1; var2++) {
         String var3 = null;
         if (this.l6.u3()) {
            var3 = this.k5.group(var2);
         }

         if (var3 == null) {
            this.u3.add(com.aspose.slides.internal.r7c.l6.k5);
         } else if (var2 >= this.n5.size()) {
            this.u3.add(new l6(var3, "", true));
         } else {
            String var4 = this.k5.group(0);
            String var5 = this.n5.get(var2);
            this.u3.add(new l6(var3, var4, var5, true, var2));
         }
      }
   }

   private List<l6> k5() {
      if (this.u3 == null) {
         this.l6();
      }

      return this.u3;
   }

   public int n5() {
      return this.k5.groupCount() + 1;
   }

   @Override
   public int size() {
      return this.n5();
   }

   @Override
   public boolean isSynchronized() {
      return false;
   }

   @Override
   public Object getSyncRoot() {
      return this.k5();
   }

   @Override
   public void copyTo(com.aspose.slides.ms.System.u3 array, int index) {
      this.k5().copyTo(array, index);
   }

   @Override
   public IEnumerator iterator() {
      return this.k5().iterator();
   }
}
