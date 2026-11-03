package com.aspose.slides;

import com.aspose.slides.Collections.Generic.LinkedList;
import com.aspose.slides.Collections.Generic.LinkedList$Enumerator;
import com.aspose.slides.Collections.Generic.LinkedListNode;
import com.aspose.slides.Collections.Generic.SortedList;
import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.ms.System.IDisposable;

class b1g {
   private boolean n5;
   private o3h l6 = null;
   private LinkedList<FontFallBackRule> k5 = null;
   private LinkedListNode<FontFallBackRule> u3 = null;
   private SortedList<Long, LinkedListNode<FontFallBackRule>> a6 = null;
   private long u9 = 0L;
   private final int h0 = 8;
   private final int c8 = 4;

   b1g(o3h var1) {
      this.l6 = var1;
      this.n5(true);
      this.a6 = new SortedList<>();
      this.k5 = new LinkedList<>();
   }

   public final void n5() {
      LinkedList$Enumerator var1 = this.k5.iterator();

      try {
         while (var1.hasNext()) {
            FontFallBackRule var2 = (FontFallBackRule)var1.next();
            var2.k5();
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var1, IDisposable.class)) {
            var1.dispose();
         }
      }

      this.k5.clear();
      this.u3 = null;
   }

   public final void n5(long var1, long var3, String var5) {
      this.n5(new FontFallBackRule(var1, var3, var5));
   }

   public final int l6() {
      return this.k5.size();
   }

   public final IFontFallBackRule n5(long var1) {
      if (this.l6() == 0) {
         return null;
      }

      long var3 = (var1 & 4294967295L) >> 8 & 4294967295L;
      LinkedListNode var5 = null;
      if (this.a6.containsKey(var3)) {
         var5 = this.a6.get_Item(var3);
      }

      long var6 = (this.u3.getValue().getRangeStartIndex() & 4294967295L) >> 8 & 4294967295L;
      long var8 = (this.u3.getValue().getRangeEndIndex() & 4294967295L) >> 8 & 4294967295L;
      boolean var10 = var5 == null || (((FontFallBackRule)var5.getValue()).l6() & 4294967295L) != (this.u9 & 4294967295L);
      if (var6 != var3 && var8 != var3) {
         int var11 = 0;

         while (var5 == null && var11 < 4) {
            int var12 = (++var11 >> 1) * -(var11 & 1);
            if (var12 >= 0 && this.a6.containsKey((var3 & 4294967295L) + (var12 & 4294967295L) & 4294967295L)) {
               var5 = this.a6.get_Item((var3 & 4294967295L) + (var12 & 4294967295L) & 4294967295L);
            }
         }

         if (var5 != null) {
            this.u3 = var5;
         }
      } else {
         if (var10) {
            this.u3.getValue().n5(this.u9);
            if (var5 == null) {
               this.a6.addItem(var3, this.u3);
            } else {
               this.a6.set_Item(var3, this.u3);
            }

            var10 = false;
         }

         if ((this.u3.getValue().getRangeStartIndex() & 4294967295L) <= (var1 & 4294967295L)
            && (var1 & 4294967295L) <= (this.u3.getValue().getRangeEndIndex() & 4294967295L)) {
            return this.u3.getValue();
         }
      }

      while (this.u3.getPrevious() != null && (this.u3.getPrevious().getValue().getRangeEndIndex() & 4294967295L) >= (var1 & 4294967295L)) {
         this.u3 = this.u3.getPrevious();
      }

      while (this.u3.getNext() != null && (this.u3.getNext().getValue().getRangeStartIndex() & 4294967295L) <= (var1 & 4294967295L)) {
         this.u3 = this.u3.getNext();
      }

      if ((this.u3.getValue().getRangeStartIndex() & 4294967295L) <= (var1 & 4294967295L)
         && (var1 & 4294967295L) <= (this.u3.getValue().getRangeEndIndex() & 4294967295L)) {
         if (var10) {
            this.u3.getValue().n5(this.u9);
            if (var5 == null) {
               this.a6.addItem(var3, this.u3);
            } else {
               this.a6.set_Item(var3, this.u3);
            }
         }

         return this.u3.getValue();
      } else {
         return null;
      }
   }

   final void n5(FontFallBackRule var1) {
      if (var1 == null) {
         throw new ArgumentNullException("sourceFallBackRule", "The source rule for adding doesn't specified!");
      }

      this.l6.n5(var1);
      if (this.l6() == 0) {
         this.u3 = this.k5.addFirst(var1);
      } else {
         long var2 = var1.getRangeStartIndex();
         long var4 = var1.getRangeEndIndex();
         if ((var4 & 4294967295L) < (this.k5.getFirst().getValue().getRangeStartIndex() & 4294967295L)) {
            this.u3 = this.k5.addFirst(var1);
         } else if ((var2 & 4294967295L) > (this.k5.getLast().getValue().getRangeEndIndex() & 4294967295L)) {
            this.u3 = this.k5.addLast(var1);
         } else {
            while (this.u3.getPrevious() != null && (this.u3.getPrevious().getValue().getRangeEndIndex() & 4294967295L) >= (var2 & 4294967295L)) {
               this.u3 = this.u3.getPrevious();
            }

            while (this.u3.getNext() != null && (this.u3.getNext().getValue().getRangeEndIndex() & 4294967295L) < (var2 & 4294967295L)) {
               this.u3 = this.u3.getNext();
            }

            while ((var4 & 4294967295L) >= (this.u3.getValue().getRangeStartIndex() & 4294967295L)) {
               if ((var2 & 4294967295L) < (this.u3.getValue().getRangeStartIndex() & 4294967295L)) {
                  this.k5.addBefore(this.u3, new FontFallBackRule(var2, (this.u3.getValue().getRangeStartIndex() & 4294967295L) - 1L & 4294967295L, var1));
                  var2 = this.u3.getValue().getRangeStartIndex();
               }

               if (this.n5(this.u3, var2)) {
                  this.u3 = this.u3.getNext();
               }

               if ((var2 & 4294967295L) > (var4 & 4294967295L)) {
                  return;
               }

               if (this.n5(this.u3, (var4 & 4294967295L) + 1L & 4294967295L)) {
                  this.u3.getValue().n5(var1, this.k5());
                  return;
               }

               if ((var4 & 4294967295L) >= (this.u3.getValue().getRangeEndIndex() & 4294967295L)) {
                  if ((var2 & 4294967295L) <= (this.u3.getValue().getRangeEndIndex() & 4294967295L)) {
                     this.u3.getValue().n5(var1, this.k5());
                     var2 = (this.u3.getValue().getRangeEndIndex() & 4294967295L) + 1L & 4294967295L;
                  }

                  if (this.u3.getNext() == null) {
                     if ((var2 & 4294967295L) <= (var4 & 4294967295L)) {
                        this.u3 = this.k5.addAfter(this.u3, new FontFallBackRule(var2, var4, var1));
                        return;
                     }
                  } else {
                     this.u3 = this.u3.getNext();
                  }
               }

               if ((var2 & 4294967295L) > (var4 & 4294967295L)) {
                  return;
               }
            }

            this.u3 = this.k5.addBefore(this.u3, new FontFallBackRule(var2, var4, var1));
         }
      }
   }

   private boolean n5(LinkedListNode<FontFallBackRule> var1, long var2) {
      if ((var2 & 4294967295L) > (((FontFallBackRule)var1.getValue()).getRangeStartIndex() & 4294967295L)
         && (var2 & 4294967295L) <= (((FontFallBackRule)var1.getValue()).getRangeEndIndex() & 4294967295L)) {
         FontFallBackRule var4 = new FontFallBackRule(var2, ((FontFallBackRule)var1.getValue()).getRangeEndIndex(), (FontFallBackRule)var1.getValue());
         ((FontFallBackRule)var1.getValue()).setRangeEndIndex((var2 & 4294967295L) - 1L & 4294967295L);
         this.k5.addAfter(var1, var4);
         return true;
      } else {
         return false;
      }
   }

   public final boolean k5() {
      return this.n5;
   }

   public final void n5(boolean var1) {
      this.n5 = var1;
   }
}
