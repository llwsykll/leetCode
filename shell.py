def shell(arr):
    gap = len(arr) // 2
    while gap > 0:
        for i in range(gap, len(arr)):
            temp = arr[i]
            j = i
            while j >= gap and temp < arr[j - gap]:
                arr[j] = arr[j - gap]
                j -= gap
            arr[j] = temp
        gap //= 2
    print(arr)

shell([81,94,11,96,12,35,17,95,28,58,41,75,15])