package com.aspose.slides.Collections.Specialized;

import com.aspose.slides.Collections.CaseInsensitiveComparer;
import com.aspose.slides.Collections.Hashtable;
import com.aspose.slides.Collections.SortedList;
import com.aspose.slides.ms.System.p6;

public class CollectionsUtil {
   public static Hashtable createCaseInsensitiveHashtable() {
      return new Hashtable(p6.n5());
   }

   public static Hashtable createCaseInsensitiveHashtable(Hashtable map) {
      return new Hashtable(map, p6.n5());
   }

   public static Hashtable createCaseInsensitiveHashtable(int capacity) {
      return new Hashtable(capacity, p6.n5());
   }

   public static SortedList createCaseInsensitiveSortedList() {
      return new SortedList(CaseInsensitiveComparer.getDefault());
   }
}
