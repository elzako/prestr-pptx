package com.aspose.slides.internal.v9l;

import java.util.Iterator;
import java.util.LinkedList;

public class k5 {
   private LinkedList<l6> n5 = new LinkedList<>();

   public int n5() {
      return this.n5.size();
   }

   public void l6() {
      this.n5.clear();
   }

   public l6 k5() {
      return this.n5.getFirst();
   }

   public l6 u3() {
      return this.n5.getLast();
   }

   public void n5(l6 var1) {
      this.n5.addFirst(var1);
   }

   public void l6(l6 var1) {
      this.n5.addLast(var1);
   }

   public l6 a6() {
      return this.n5.removeLast();
   }

   public Iterator<l6> u9() {
      return this.n5.iterator();
   }

   public Iterator<l6> h0() {
      return this.n5.descendingIterator();
   }

   public k5 c8() {
      k5 var1 = new k5();
      float var2 = 0.0F;
      float var3 = 0.0F;

      for (l6 var5 : this.n5) {
         float[] var6 = var5.k5();
         switch (var5.l6()) {
            case 2:
               var2 = var6[0];
               var3 = var6[1];
            case 3:
            case 5:
            case 7:
            case 9:
            case 10:
            default:
               break;
            case 4:
               var1.n5(l6.l6(var2, var3));
               var2 = var6[0];
               var3 = var6[1];
               break;
            case 6:
               var1.n5(l6.n5(var6[0], var6[1], var2, var3));
               var2 = var6[2];
               var3 = var6[3];
               break;
            case 8:
               var1.n5(l6.n5(var6[2], var6[3], var6[0], var6[1], var2, var3));
               var2 = var6[4];
               var3 = var6[5];
         }
      }

      var1.n5(l6.n5(var2, var3));
      return var1;
   }
}
