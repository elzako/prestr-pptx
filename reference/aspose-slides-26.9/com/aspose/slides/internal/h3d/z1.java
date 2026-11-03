package com.aspose.slides.internal.h3d;

import com.aspose.slides.Collections.ArrayList;
import com.aspose.slides.Collections.Hashtable;
import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.exceptions.ArgumentOutOfRangeException;
import com.aspose.slides.exceptions.SerializationException;
import com.aspose.slides.ms.System.d1;
import com.aspose.slides.ms.System.j8;

public class z1 {
   private t4 n5 = null;
   private t4 l6 = null;
   private ArrayList k5 = new ArrayList();
   private ArrayList u3 = new ArrayList();
   private Hashtable a6 = new Hashtable();
   private boolean u9 = false;
   private n3 h0;
   private s3 c8 = new s3();
   private int t2 = 0;

   public z1(n3 var1, s3 var2) {
      this.h0 = var1;
      var2.n5(this.c8);
   }

   public void n5() {
      this.u9 = true;

      try {
         if (this.t2 < this.a6.size()) {
            throw new SerializationException("There are some fixups that refer to objects that have not been registered");
         }

         t4 var1 = this.l6;
         boolean var2 = true;
         t4 var3 = this.n5;

         while (var3 != null) {
            boolean var4 = !var3.l6() || !var2;
            if (var4) {
               var4 = var3.n5(true, this, true);
            }

            if (var4) {
               var4 = var3.n5(this, this.h0, this.c8.k5());
            }

            t4 var6;
            if (var4) {
               if (var3.l6 instanceof h0) {
                  this.k5.addItem(var3);
               }

               z8 var5 = z8.n5(j8.n5(var3.l6));
               if (var5.l6()) {
                  this.u3.addItem(var3);
               }

               var6 = var3.y4;
            } else {
               if (var3.k5 instanceof t2 && !var2) {
                  if (var3.n5 == 2) {
                     throw new SerializationException(d1.n5(new Object[]{"The object with ID ", var3.u3, " could not be resolved"}));
                  }

                  var3.n5 = 2;
               }

               if (var3 != this.l6) {
                  var6 = var3.y4;
                  var3.y4 = null;
                  this.l6.y4 = var3;
                  this.l6 = var3;
               } else {
                  var6 = var3;
               }
            }

            if (var3 == var1) {
               var2 = false;
            }

            var3 = var6;
         }
      } finally {
         this.u9 = false;
      }
   }

   t4 n5(long var1) {
      t4 var3 = (t4)this.a6.get_Item(var1);
      if (var3 == null) {
         if (this.u9) {
            throw new SerializationException(d1.n5(new Object[]{"The object with Id ", var1, " has not been registered"}));
         }

         var3 = new t4();
         var3.u3 = var1;
         this.a6.set_Item(var1, var3);
      }

      if (!var3.k5() && this.u9) {
         throw new SerializationException(d1.n5(new Object[]{"The object with Id ", var1, " has not been registered"}));
      } else {
         return var3;
      }
   }

   public Object l6(long var1) {
      if (var1 <= 0L) {
         throw new ArgumentOutOfRangeException("objectID", "The objectID parameter is less than or equal to zero");
      }

      t4 var3 = (t4)this.a6.get_Item(var1);
      return var3 != null && var3.k5() ? var3.k5 : null;
   }

   public void l6() {
      for (int var1 = this.u3.size() - 1; var1 >= 0; var1--) {
         t4 var2 = (t4)this.u3.get_Item(var1);
         this.l6(var2.l6);
      }

      for (int var4 = this.k5.size() - 1; var4 >= 0; var4--) {
         t4 var5 = (t4)this.k5.get_Item(var4);
         h0 var3 = var5.l6 instanceof h0 ? (h0)var5.l6 : null;
         if (var3 != null) {
            var3.onDeserialization(this);
         }
      }
   }

   public void n5(Object var1) {
      z8 var2 = z8.n5(j8.n5(var1));
      var2.k5(var1, this.c8.k5());
   }

   private void l6(Object var1) {
      z8 var2 = z8.n5(j8.n5(var1));
      var2.u3(var1, this.c8.k5());
   }

   private void n5(l6 var1) {
      var1.n5.l6(var1, true);
      var1.l6.l6(var1, false);
   }

   public void n5(long var1, int var3, long var4) {
      if (var1 <= 0L) {
         throw new ArgumentOutOfRangeException("arrayToBeFixed", "The arrayToBeFixed parameter is less than or equal to zero");
      }

      if (var4 <= 0L) {
         throw new ArgumentOutOfRangeException("objectRequired", "The objectRequired parameter is less than or equal to zero");
      }

      n5 var6 = new n5(this.n5(var1), var3, this.n5(var4));
      this.n5(var6);
   }

   public void n5(long var1, int[] var3, long var4) {
      if (var1 <= 0L) {
         throw new ArgumentOutOfRangeException("arrayToBeFixed", "The arrayToBeFixed parameter is less than or equal to zero");
      }

      if (var4 <= 0L) {
         throw new ArgumentOutOfRangeException("objectRequired", "The objectRequired parameter is less than or equal to zero");
      }

      if (var3 == null) {
         throw new ArgumentNullException("indices");
      }

      y4 var6 = new y4(this.n5(var1), var3, this.n5(var4));
      this.n5(var6);
   }

   public void n5(long var1, String var3, long var4) {
      if (var1 <= 0L) {
         throw new ArgumentOutOfRangeException("objectToBeFixed", "The objectToBeFixed parameter is less than or equal to zero");
      }

      if (var4 <= 0L) {
         throw new ArgumentOutOfRangeException("objectRequired", "The objectRequired parameter is less than or equal to zero");
      }

      if (var3 == null) {
         throw new ArgumentNullException("memberName");
      }

      k5 var6 = new k5(this.n5(var1), var3, this.n5(var4));
      this.n5(var6);
   }

   public void n5(long var1, com.aspose.slides.internal.p4l.e2 var3, long var4) {
      if (var1 <= 0L) {
         throw new ArgumentOutOfRangeException("objectToBeFixed", "The objectToBeFixed parameter is less than or equal to zero");
      }

      if (var4 <= 0L) {
         throw new ArgumentOutOfRangeException("objectRequired", "The objectRequired parameter is less than or equal to zero");
      }

      if (var3 == null) {
         throw new ArgumentNullException("member");
      }

      u3 var6 = new u3(this.n5(var1), var3, this.n5(var4));
      this.n5(var6);
   }

   private void n5(Object var1, t4 var2) {
      if (var1 == null) {
         throw new ArgumentNullException("obj");
      }

      if (var2.k5()) {
         if (var2.l6 != var1) {
            throw new SerializationException(d1.n5(new Object[]{"An object with Id ", var2.u3, " has already been registered"}));
         }
      } else {
         var2.k5 = var1;
         var2.l6 = var1;
         if (var1 instanceof t2) {
            var2.n5 = 1;
         } else {
            var2.n5 = 3;
         }

         if (this.h0 != null) {
            n3[] var3 = new n3[]{var2.c8};
            var2.h0 = this.h0.n5(j8.n5(var1), this.c8.k5(), var3);
            var2.c8 = var3[0];
            if (var2.h0 != null) {
               var2.n5 = 1;
            }
         }

         var2.n5(true, this, false);
         var2.n5(false, this, false);
         this.t2++;
         if (this.n5 == null) {
            this.n5 = var2;
            this.l6 = var2;
         } else {
            this.l6.y4 = var2;
            this.l6 = var2;
         }
      }
   }

   public void n5(Object var1, long var2, c4 var4, long var5, com.aspose.slides.internal.p4l.e2 var7, int[] var8) {
      if (var1 == null) {
         throw new ArgumentNullException("obj", "The obj parameter is null.");
      }

      if (var2 <= 0L) {
         throw new ArgumentOutOfRangeException("objectID", "The objectID parameter is less than or equal to zero");
      }

      t4 var9 = this.n5(var2);
      var9.a6 = var4;
      var9.u9 = var5;
      var9.t2 = var7;
      var9.s7 = var8;
      this.n5(var1, var9);
   }
}
