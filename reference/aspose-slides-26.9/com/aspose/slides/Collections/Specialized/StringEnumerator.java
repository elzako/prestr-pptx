package com.aspose.slides.Collections.Specialized;

import com.aspose.slides.Collections.IEnumerator;
import com.aspose.slides.exceptions.NotImplementedException;

public class StringEnumerator {
   private IEnumerator n5;

   public String next() {
      return (String)this.n5.next();
   }

   public void remove() {
      throw new NotImplementedException();
   }

   public boolean hasNext() {
      return this.n5.hasNext();
   }

   public void reset() {
      this.n5.reset();
   }
}
